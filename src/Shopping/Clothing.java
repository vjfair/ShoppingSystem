package Shopping;

public class Clothing extends Product
{

    public Clothing(String productId, String productName, double price)
    {
        super(productId, productName, price);
    }

    public double calculateDiscount()
    {
        return 0.50;
    }
}
