package racingcar.view;

public enum InputMessageType implements MessageType{
    ENTER_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ENTER_RACING_COUNT("시도할 회수는 몇회인가요?")
    ;

    private final String message;

    InputMessageType(final String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
