package UnitTests;

import Exceptions.ContinentNotFoundException;
import Shopping.*;

import static org.junit.jupiter.api.Assertions.*;

class CartTest
{

    @org.junit.jupiter.api.Test
    void addItem()
    {
        Cart cart = new Cart();
        Electronics electronic = new Electronics("123","test", 450);
        Clothing clothes = new Clothing("123","test", 450);

        cart.addItem(new CartItem(electronic, 2));
        cart.addItem(new CartItem(clothes, 2));

        assertFalse(cart.cartItems.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void calculateTotalCost() throws ContinentNotFoundException
    {
        Electronics keyboard = new Electronics("1", "Keyboard", 500);
        Electronics mouse = new Electronics("2", "Mouse", 400);
        Clothing cap = new Clothing("3", "Cap", 199);
        Cart cart = new Cart();
        cart.addItem(new CartItem(keyboard, 1));
        cart.addItem(new CartItem(mouse, 1));
        cart.addItem(new CartItem(cap, 2));
        cart.destination = "africa";
        cart.totalWeight = 4;
        double expected = 1129.0;
        double result = cart.calculateTotalCost();
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void calculateTotalShippingCost() throws ContinentNotFoundException
    {
        Cart cart = new Cart();
        cart.totalWeight = 4;
        cart.destination = "africa";
        double expected = 120;
        double result = cart.calculateTotalShippingCost();
        assertEquals(expected,result);
    }
}