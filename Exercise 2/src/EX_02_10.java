/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules.
*/

import java.util.Scanner;
public class EX_02_10
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double InitialTemp = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double FinalTemp = input.nextDouble();

        //calculation
        double Energy = water * (FinalTemp - InitialTemp) * 4184;

        //Display the result
        System.out.println("The energy needed is " + Energy);
    }
}
