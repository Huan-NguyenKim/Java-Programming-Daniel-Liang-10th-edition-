/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
                                  v1 - v0
                             a = ---------
                                     t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
*/
import java.util.Scanner;

public class EX_02_09
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        //calculation
        double acceleration = (v1 - v0) / t;

        //Display the result
        System.out.println("The average acceleration is " + acceleration);
    }

}
