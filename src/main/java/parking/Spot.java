package parking;

import exception.InvalidInputException;

import java.util.Arrays;

// 연속적인 숫자보다는 숫자보다는 ,,
public enum Spot {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5);

    private final int spot;

    public static long count() {
        return Arrays.stream(Spot.values()).count();
    }

    Spot(final int spot) {
        this.spot = spot;
    }

    public static Spot findByFloor(int inputSpot) {
        return Arrays.stream(Spot.values())
                .filter(f -> f.spot == inputSpot)
                .findAny()
                .orElseThrow(() -> new InvalidInputException(InvalidInputException.ErrorCode.SPOT));
    }

}
