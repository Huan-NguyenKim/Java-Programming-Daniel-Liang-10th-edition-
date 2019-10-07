/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/

import java.util.Scanner;
public class EX_02_05
{
    public static void main(String[] args)
    {
        //create a Scanner;
        Scanner input = new Scanner(System.in);

        //Ask for input
        System.out.println("PLease enter a subtotal and gratuity rate");
        double subtotal = input.nextDouble();
        double tiprate = input.nextDouble();

        //calculation
        double gratuity = subtotal * (tiprate/100);
        double FinalTotal = subtotal + gratuity;

        //Display the results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + FinalTotal);
    }
}
