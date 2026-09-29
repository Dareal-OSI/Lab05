import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        // Create a Scanner to read input from the console
        // Declare variables for age and bad input
        // Prompt the user to enter their age
        // If the input is a valid int
        //     Read the age and clear the buffer
        //     If age >= 21
        //         Display a message that they get a wrist band
        //     End if (do nothing if under 21)
        // Else
        //     Read the bad input as a String
        //     Display an error and tell the user to run the program again
        // End if

        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // clear the buffer

            if (age >= 21)
            {
                System.out.println("You are 21 or over. You get a paper wrist band!");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid age: " + trash);
            System.out.println("Run the program again and enter a valid age!");
        }
    }
}