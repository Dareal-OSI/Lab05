import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        // Create a Scanner to read input from the console
        // Declare variables for the month and bad input
        // Prompt the user to enter their birth month (1 - 12)
        // If the input is a valid int
        //     Read the month and clear the buffer
        //     If month is between 1 and 12 inclusive
        //         Display "Your birth month is: N"
        //     Else
        //         Display "You entered an incorrect month value: N"
        //     End if
        // Else
        //     Read the bad input as a String
        //     Display an error and tell the user to run the program again
        // End if

        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = "";

        System.out.print("Enter your birth month (1 - 12): ");

        if (in.hasNextInt())
        {
            month = in.nextInt();
            in.nextLine(); // clear the buffer

            if (month >= 1 && month <= 12)
            {
                System.out.println("Your birth month is: " + month);
            }
            else
            {
                System.out.println("You entered an incorrect month value: " + month);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
            System.out.println("Run the program again and enter a whole number 1 - 12!");
        }
    }
}