/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/

import java.util.Scanner;

public class EX_02_03
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a number in feet: ");
        double feet = input.nextDouble();

        //conversion
        double meter = feet * 0.305;

        //Display the result
        System.out.println("Your number is " + meter+ " meter");

    }
}
