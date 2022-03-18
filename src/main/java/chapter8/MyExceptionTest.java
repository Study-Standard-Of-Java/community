package chapter8;

public class MyExceptionTest {
    public static void main(String[] args) {
        int TvPrice=10000;

        TvPrice-=13000*Math.random();
        if (TvPrice > 0) {
            System.out.println("TvPrice = " + TvPrice);
            return;
        }
        throw new ErrorPriceException(ErrorCode.MINUS_PRICE.getCode(), ErrorCode.MINUS_PRICE.getName());
    }
    public static void WaterTest() {
        int WaterPrice = 100;
        WaterPrice += 100 * Math.random();

        if (WaterPrice < 140) {
            System.out.println("WaterPrice = " + WaterPrice);
            return;
        }
        throw new ErrorPriceException(ErrorCode.OVER_PRICE.getCode(), ErrorCode.OVER_PRICE.getName());
    }
}
