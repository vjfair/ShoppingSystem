import Shopping.Cart;
import Shopping.CartItem;
import Shopping.Clothing;
import Shopping.Electronics;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Electronics keyboard = new Electronics("1", "Keyboard", 500);
        Electronics mouse = new Electronics("2", "Mouse", 400);
        Clothing cap = new Clothing("3", "Cap", 199);

        Cart cart = new Cart();
        cart.addItem(new CartItem(keyboard, 1));
        cart.addItem(new CartItem(mouse, 1));
        cart.addItem(new CartItem(cap, 2));
        cart.totalWeight = 4;
        System.out.println(cart.checkOut());

    }
}