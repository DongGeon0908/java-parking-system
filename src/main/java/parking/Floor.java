package parking;

import exception.ErrorCode;
import exception.InvalidInputException;

import java.util.Arrays;

// db라고 생각하자.. 실제 오브젝트로 사용하기보다는 값으로
public enum Floor {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5);

    private final int floor;

    public static long count() {
        return Arrays.stream(Floor.values()).count();
    }


    Floor(final int floor) {
        this.floor = floor;
    }

    public int value() {
        return floor;
    }

    public static Floor findByFloor(int inputFloor) {
        return Arrays.stream(Floor.values())
                .filter(f -> f.floor == inputFloor)
                .findAny()
                .orElseThrow(() -> new InvalidInputException(ErrorCode.FLOOR));
    }

}
