/**
 * (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * The formula for computing the distance is
 *        __________________________
 *      √(x2 - x1)^2 + (y2 - y1)^2
 *
 * Note that you can use Math.pow(a, 0.5) to compute 2a.
 */

import java.util.Scanner;
public class EX_02_19
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Please enter x1 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //calculation
        double distance = Math.pow((Math.pow(x2 - x1,1 ) + Math.pow(y2 -y1,2)),0.5);

        //Display the result
        System.out.println("The distance between the two points is " + distance);
    }
}
