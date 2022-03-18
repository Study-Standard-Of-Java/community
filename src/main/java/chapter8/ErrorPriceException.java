package chapter8;

public class ErrorPriceException extends RuntimeException {

    public ErrorPriceException(int errorCode, String msg) {
        super(msg + " 에러코드: " + errorCode);
    }
}
