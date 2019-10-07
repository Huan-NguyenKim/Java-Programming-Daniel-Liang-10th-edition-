/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/

import java.util.Scanner;
public class EX_02_01
{
    public static void main(String[] args)
    {
        //create a Scanner;
        Scanner input = new Scanner(System.in);

        //Ask for input
        System.out.println("PLease enter a Celsius degree: ");
        double Celsius = input.nextDouble();

        //converting C to F degree
        double Fahrenheit = ( Celsius * 9/5) + 32;

        //Display
        System.out.println("The degree in Fahrenheit is " + Fahrenheit);

    }
}
