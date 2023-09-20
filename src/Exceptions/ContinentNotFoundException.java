package Exceptions;

public class ContinentNotFoundException extends Exception
{
    public ContinentNotFoundException()
    {
        super("Continent not found");
    }
}
