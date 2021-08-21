package car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberTest {

    @Test
    @DisplayName("차량 번호 확인")
    void isCorrectNumber() {
        String[] testCase = {"1234", "2345", "3454"};

        for (int i = 0; i < testCase.length; i++) {
            new Number(testCase[i]);
        }
    }

    @Test
    @DisplayName("차량 번호 확인 실패_1")
    void isFailTestNumber_1() {
        String testCase = "12345";
        new Number(testCase);
    }

    @Test
    @DisplayName("차량 번호 확인 실패_2")
    void isFailTestNumber_2() {
        String testCase = "123aa";
        new Number(testCase);
    }
}