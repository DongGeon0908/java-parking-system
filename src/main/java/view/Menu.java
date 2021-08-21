package view;

import exception.InvalidInputException;

import java.util.Arrays;

public enum Menu {
    INPUT_CAR("입차"),
    OUTPUT_CAR("출차"),
    FIND_CAR("조회"),
    EXIT("종료");

    private final String menu;

    Menu(final String menu) {
        this.menu = menu;
    }

    public static Menu findByMenu(String inputMenu) {
        return Arrays.stream(Menu.values())
                .filter(f -> f.menu.equals(inputMenu))
                .findAny()
                .orElseThrow(() -> new InvalidInputException(InvalidInputException.ErrorCode.WRONG_INPUT_MENU));
    }

}
