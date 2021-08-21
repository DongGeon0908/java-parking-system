package parking;

import common.Size;

import java.util.Objects;

public class Position {
    private final Floor floor;
    private final Size size;
    private final Spot spot;

    public Position(Floor floor, Size size, Spot spot) {
        this.floor = floor;
        this.size = size;
        this.spot = spot;
    }

    public Size size() {
        return size;
    }

    @Override
    public String toString() {
        return "조회된 자동차의 위치는 " +
                "Position{" +
                "floor=" + floor +
                ", size=" + size +
                ", spot=" + spot +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return floor == position.floor && size == position.size && spot == position.spot;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, size, spot);
    }
}
