import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        // Create a Scanner to read input from the console
        // Declare a variable for the user's choice
        // Display a menu: D for Democrat, R for Republican, I for Independent
        // Prompt the user to enter the first letter of their party
        // Read the choice as a String
        // If choice is D
        //     Display "You get a Democratic Donkey."
        // Else if choice is R
        //     Display "You get a Republican Elephant."
        // Else if choice is I
        //     Display "You get an Independent Person."
        // Else
        //     Display "You get an Other."
        // End if

        Scanner in = new Scanner(System.in);
        String choice = "";

        System.out.println("Party Affiliation Menu");
        System.out.println("  D - Democrat");
        System.out.println("  R - Republican");
        System.out.println("  I - Independent");
        System.out.print("Enter the first letter of your party affiliation: ");

        choice = in.nextLine();

        if (choice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (choice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (choice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person.");
        }
        else
        {
            System.out.println("You get an Other.");
        }
    }
}