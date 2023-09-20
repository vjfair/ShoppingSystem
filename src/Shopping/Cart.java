package Shopping;

import Exceptions.ContinentNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart implements Shipping
{
    public String destination;
    public double totalWeight;
    double WEIGHT_RATE = 5;
    public ArrayList<CartItem> cartItems = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    String[] continents = {"africa", "europe", "asia", "north america", "south america", "australia"};
    public void addItem(CartItem cartItem)
    {
        this.cartItems.add(cartItem);
    }
    public double calculateTotalCost() throws ContinentNotFoundException
    {
        double total = 0;
        for (var cartItem : cartItems)
        {
            total += cartItem.calculateTotalCosts();
        }
        total += calculateTotalShippingCost();

        return total;
    }
    public String checkOut()
    {
        String output = "";
        output += toString();

        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter the destination");
            destination = input.nextLine();
            try{
                output += "\n" + "The total amount due is: " + calculateTotalCost();
                output += "\n" + "Shipping costs: " + calculateTotalShippingCost();

                flag = false;
                return output;
            }catch (NumberFormatException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Please enter a number");
            } catch (ContinentNotFoundException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Please enter a valid continent");
            }
        }
        return output;
    }


    @Override
    public double calculateTotalShippingCost() throws ContinentNotFoundException
    {
        double cost = 0.0;
        if (destination.equalsIgnoreCase(continents[0]))
        {
            cost = totalWeight * WEIGHT_RATE + 100;
        }
        for (int i = 1; i < continents.length; i++)
        {
            if (continents[i].equalsIgnoreCase(destination))
            {
                cost = totalWeight * WEIGHT_RATE + 400;
                return cost;
            }
        }
        if (cost == 0)
        {
            throw new ContinentNotFoundException();
        }
        return cost;
    }
    public String toString()
    {
        String output = "";
        for (var cartItem : cartItems)
        {
            output += "\n"+cartItem.toString();
        }
        return output;
    }
}
