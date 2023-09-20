package Shopping;

import Exceptions.ContinentNotFoundException;

public interface Shipping
{
    double calculateTotalShippingCost() throws ContinentNotFoundException;
}
