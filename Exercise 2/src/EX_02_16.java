/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area.
*/

import java.util.Scanner;

public class EX_02_16
{
    public static void main(String[] args)
    {
        //create a SCanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter the side: ");
        double side = input.nextDouble();

        //calculation
        double area = ((3 * Math.pow(3,0.5)) / 2) * Math.pow (side,2);

        //Display the result
        System.out.println("The area of hexagon is " + area );
    }
}
