package parking;

import car.Car;
import common.Size;
import exception.InvalidInputException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingSystem {
    private final static Map<Position, Car> storage = new ConcurrentHashMap<>();

    public void validDuplication(Position position, Car car) {
        if (isEmptyPosition(position)) {
            throw new InvalidInputException(InvalidInputException.ErrorCode.DUPLICATION_POSITION);
        }

        if (isDuplicationCar(car)) {
            throw new InvalidInputException(InvalidInputException.ErrorCode.DUPLICATION_CAR);
        }
    }

    public boolean isDuplicationCar(Car car) {
        return storage.containsValue(car);
    }

    public boolean isEmptyPosition(Position position) {
        return storage.containsKey(position);
    }

    public Car addCar(Position position, Car car) {
        if (car.size() == Size.SMALL || car.size() == position.size()) {
            storage.put(position, car);
            return car;
        }
        throw new InvalidInputException(InvalidInputException.ErrorCode.NOT_CORRECT_SPOT_SIZE);
    }

    // carNumber를 잘 활용해보자!
    public Car takeOutCar(String carNumber) {
        for (Position position : storage.keySet()) {
            if (carNumber.equals(storage.get(position).number())) {
                return storage.remove(position);
            }
        }
        throw new InvalidInputException(InvalidInputException.ErrorCode.NOT_EXIT_CAR);
    }

    public void isFullStorage() {
        if (storage.size() == fullSize()) {
            throw new InvalidInputException(InvalidInputException.ErrorCode.FULL_STORAGE);
        }
    }

    public int fullSize() {
        return (int) (Floor.count() * Spot.count() * Size.count());
    }

    public Position findByMyCar(String carNumber) {
        for (Position position : storage.keySet()) {
            if (carNumber.equals(storage.get(position).number())) {
                return position;
            }
        }
        throw new InvalidInputException(InvalidInputException.ErrorCode.NOT_EXIT_CAR);
    }

}
