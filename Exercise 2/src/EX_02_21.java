/*
(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value using the following formula:
							futureInvestmentValue =
		investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number
of years 1, the future investment value is 1032.98.
*/


import java.util.Scanner;
public class EX_02_21
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter an investment amount: ");
        double investment = input.nextDouble();

        System.out.println(" Please enter an annual interest rate in percentage: ");
        double AnnualRate = input.nextDouble();

        System.out.println("Please enter number of years: ");
        int years = input.nextInt();

        //calculation
        double FutureInvesment =  investment * Math.pow( (1 + ((AnnualRate/12)) /100), years * 12);

        //Display the result
        System.out.println("Accumulated value is: " + "$" + FutureInvesment);
    }
}
