package test;

public class fixPolicy implements SalePolicy{

    @Override
    public int saleProduct(int price) {
        return price-1000;
    }
}
