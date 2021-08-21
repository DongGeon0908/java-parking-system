package parking;

import car.Car;
import car.Number;
import common.Size;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSystemTest {

    @Test
    @DisplayName("중복된 위치 검사")
    void duplicate_parking_position_information() {
        Position position1 = new Position(Floor.FIRST, Size.SMALL, Spot.FIRST);
        Position position2 = new Position(Floor.FIRST, Size.SMALL, Spot.FIRST);
        Number number = new Number("1234");
        Car car = new Car(Size.SMALL, number);

        ParkingSystem parkingSystem = new ParkingSystem();

        parkingSystem.addCar(position1, car);
        assertEquals(true, parkingSystem.isEmptyPosition(position2));
    }

    @Test
    @DisplayName("중복된 자동차 검사")
    void duplicate_car_information() {
        Position position1 = new Position(Floor.FIRST, Size.SMALL, Spot.FIRST);
        Number number1 = new Number("1234");
        Number number2 = new Number("1234");
        Car car1 = new Car(Size.SMALL, number1);
        Car car2 = new Car(Size.SMALL, number2);

        ParkingSystem parkingSystem = new ParkingSystem();

        parkingSystem.addCar(position1, car1);
        assertEquals(true, parkingSystem.isDuplicationCar(car2));
    }

    @Test
    @DisplayName("자동차 사이즈에 따른 입차")
    void addCar() {
        Position position = new Position(Floor.FIRST, Size.SMALL, Spot.FIRST);
        Number number = new Number("1234");
        Car car = new Car(Size.MIDDLE, number);

        ParkingSystem parkingSystem = new ParkingSystem();

        parkingSystem.addCar(position, car);
    }

    @Test
    @DisplayName("자동차 출차")
    void exitCar() {
        Position position = new Position(Floor.FIRST, Size.SMALL, Spot.FIRST);
        Number number = new Number("1234");
        Car car = new Car(Size.SMALL, number);

        ParkingSystem parkingSystem = new ParkingSystem();
        parkingSystem.addCar(position, car);
    }


}