/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)
*/

import java.util.Scanner;
public class EX_02_13
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter the monthly saving amount: ");
        double saving = input.nextDouble();

        //calculator
        double YearlyInterest  = 0.05;
        double MonthlyInterest = YearlyInterest/12;

        double FirstMonth = saving + (saving * MonthlyInterest);
        double SecondMonth = saving + FirstMonth + ((saving + FirstMonth) * MonthlyInterest);
        double ThirdMonth = saving + SecondMonth + ((saving + SecondMonth) * MonthlyInterest);
        double FourthMonth = saving + ThirdMonth + ((saving + ThirdMonth) * MonthlyInterest);
        double FifthMonth = saving + FourthMonth + ((saving + FourthMonth) * MonthlyInterest);
        double SixMonth = saving + FifthMonth + ((saving + FifthMonth) * MonthlyInterest);

        //Display the result
        System.out.println("After sixth month, the account value is " + SixMonth);

    }
}
