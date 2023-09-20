package Shopping;

public class CartItem
{
    Product product;
    int quantity;

    public CartItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalCosts()
    {
        return quantity * (product.price * (1-product.calculateDiscount()));
    }

    @Override
    public String toString()
    {
        return "Product: " + product.productName + "\tQuantity: " + quantity + "\tDiscounted price: " + product.price * (1-product.calculateDiscount());
    }
}
