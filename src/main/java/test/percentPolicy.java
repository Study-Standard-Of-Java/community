package test;

public class percentPolicy implements SalePolicy{
    @Override
    public int saleProduct(int price) {
        price= (int) (price*0.9);
        return price;
    }
}
