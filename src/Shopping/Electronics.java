package Shopping;

public class Electronics extends Product
{

    public Electronics(String productId, String productName, double price)
    {
        super(productId, productName, price);
    }
    public double calculateDiscount()
    {
        return 0.10;
    }
}
