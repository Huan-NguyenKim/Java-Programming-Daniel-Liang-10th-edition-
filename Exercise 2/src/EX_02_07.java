/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. Here is a sample run:
*/

import java.util.Scanner;
public class EX_02_07
{
    public static void main(String[] args)
    {
        //create a Scanner;
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter the number of minutes: ");
        int minutes = input.nextInt();

        //calculation
        // 60 minutes = 1 hour
        // 24 hours = 1 day
        // 365 days = 1 year

        int years = minutes / (60 * 24 * 365);
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);

        //Display the result
        System.out.println("1 Billion minutes is approximately is "+ years + " years and " + days + " days ");


    }
}
