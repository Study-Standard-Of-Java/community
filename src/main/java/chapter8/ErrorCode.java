package chapter8;

public enum ErrorCode {

    MINUS_PRICE("0원 미만의 가격입니다", 1),
    OVER_PRICE("예상금액을 초과했습니다", 2);

    private String name;
    private int code;

    ErrorCode(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
