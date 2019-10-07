/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
*/
import java.lang.Math.*;
import java.util.Scanner;
public class EX_02_02
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a radius and a length");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        //Calculation
        double area = radius * radius * Math.PI;
        double volume = area * length;

        //Display the results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
