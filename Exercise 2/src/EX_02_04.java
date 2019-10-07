
/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

import java.util.Scanner;
public class EX_02_04
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a number in pounds: ");
        double pounds = input.nextDouble();

        //Conversion
        double kilograms = pounds * 0.454;

        //Display the result
        System.out.println("The number you entered in kilograms is: " + kilograms + " kilograms");

    }
}
