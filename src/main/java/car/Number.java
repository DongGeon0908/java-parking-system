package car;

import exception.InvalidInputException;

import java.util.Objects;
import java.util.regex.Pattern;

public class Number {
    private final String number;
    private final static String NUMBER_VALIDATION_CODE = "^[0-9]{4}$";

    public Number(String number) {
        validNumber(number);
        this.number = number;
    }

    public void validNumber(String number) {
        if (!Pattern.matches(NUMBER_VALIDATION_CODE, number)) {
            throw new InvalidInputException(InvalidInputException.ErrorCode.NUMBER);
        }
    }

    public String number() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number1 = (Number) o;
        return Objects.equals(number, number1.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
