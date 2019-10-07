/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/

import java.util.Scanner;
public class EX_02_14
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a weight ");
        double weight = input.nextDouble();

        System.out.println("Please enter a height ");
        double height = input.nextDouble();

        //conversion
        // Note that 1 pound = 0.45359237, and 1 inch is 0.2054

        double weightKG = weight * 0.45359237;
        double heightM = height * 0.0254;

        double BMI = weightKG / (heightM * heightM);

        //Display the result
        System.out.println("BMI is " + BMI);
    }
}
