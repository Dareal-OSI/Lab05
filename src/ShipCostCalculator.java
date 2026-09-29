import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        // Create a Scanner to read input from the console
        // Declare variables for price, shipping, total, and bad input
        // Prompt the user to enter the price of the item
        // If the input is a valid double
        //     Read the price and clear the buffer
        //     If price >= 100 then shipping is free (0)
        //     Else shipping is 2% of the price
        //     Total = price + shipping
        //     Display the shipping cost and the total price
        // Else
        //     Read the bad input as a String
        //     Display an error and tell the user to run the program again
        // End if

        Scanner in = new Scanner(System.in);
        double price = 0;
        double shipping = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine(); // clear the buffer

            if (price >= 100)
            {
                shipping = 0;
            }
            else
            {
                shipping = price * 0.02;
            }

            total = price + shipping;

            System.out.printf("Shipping cost: $%.2f%n", shipping);
            System.out.printf("Total price:   $%.2f%n", total);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid price: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
        }
    }
}