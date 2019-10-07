/*
(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment
using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
*/

import java.util.Scanner;
public class EX_02_20
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter balance and interest rate: ");
        double balance = input.nextDouble();
        double AnualRate = input.nextDouble();

        //calculation
        double interest = balance * (AnualRate/1200);

        //Display th result;
        System.out.println("The interest is " + interest);

    }
}
