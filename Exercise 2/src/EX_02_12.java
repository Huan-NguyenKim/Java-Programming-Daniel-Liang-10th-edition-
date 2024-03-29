/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
												v^2
									length = ---
												 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/

import java.util.Scanner;
public class EX_02_12
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        //calculation
        double length = (speed * speed) / (2 * acceleration);

        //Display the results
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
