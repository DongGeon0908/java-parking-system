package common;

import exception.ErrorCode;
import exception.InvalidInputException;

import java.util.Arrays;

public enum Size {
    SMALL(1),
    MIDDLE(2),
    LARGE(3);

    private final int size;

    Size(final int size) {
        this.size = size;
    }

    public static long count() {
        return Arrays.stream(Size.values()).count();
    }

    public static Size findBySize(int inputSize) {
        return Arrays.stream(Size.values())
                .filter(s -> s.size == inputSize)
                .findAny()
                .orElseThrow(() -> new InvalidInputException(ErrorCode.SIZE));
    }
}
