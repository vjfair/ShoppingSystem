package Shopping;

public abstract class Product
{
    String productId;
    String productName;
    double price;

    public Product(String productId, String productName, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public abstract double calculateDiscount();
}
