package exception;

public enum ErrorCode {
    FLOOR("잘못된 층수 입력입니다."),
    NUMBER("잘못된 차량번호 입력입니다."),
    SIZE("잘못된 사이즈 입력입니다."),
    SPOT("잘못된 위치정보 입력입니다."),
    DUPLICATION_POSITION("이미 주차된 공간 입니다."),
    DUPLICATION_CAR("이미 주차된 차량 입니다."),
    NOT_CORRECT_SPOT_SIZE("잘못된 사이즈 입력입니다."),
    NOT_EXIT_CAR("주차된 차량이 아닙니다."),
    FULL_STORAGE("만차 상태입니다. 주차가 불가능합니다."),
    WRONG_INPUT_MENU("잘못된 메뉴 입력입니다."),
    WRONG_INPUT_SIZE("잘못된 입력입니다.");

    private final String message;

    ErrorCode(final String message) {
        this.message = message;
    }

    public String value() {
        return message;
    }
}
