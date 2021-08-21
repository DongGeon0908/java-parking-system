package car;

import common.Size;

import java.util.Objects;

public class Car {
    private final Size size;
    private final Number number;

    public Car(Size size, Number number) {
        this.size = size;
        this.number = number;
    }

    public Size size() {
        return size;
    }

    public String number() {
        return number.number();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return size == car.size && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, number);
    }

    @Override
    public String toString() {
        return "출차된 차량 정보 : "
                + "Car{" +
                "size=" + size +
                ", number=" + number +
                '}';
    }
}
