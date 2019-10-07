/*
(Science: wind-chill temperature) How cold is it outside? The temperature alone
is not enough to provide the answer. Other factors including wind speed, relative
humidity, and sunshine play important roles in determining coldness outside.
In 2001, the National Weather Service (NWS) implemented the new wind-chill
temperature to measure the coldness using temperature and wind speed. The
formula is
		twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
where ta is the outside temperature measured in degrees Fahrenheit and v is the
speed measured in miles per hour. twc is the wind-chill temperature. The formula
cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or
above 41ºF.
Write a program that prompts the user to enter a temperature between -58 ºF and
41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
Use Math.pow(a, b) to compute v^0.16
*/

import java.util.Scanner;
public class EX_02_17
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();

        System.out.println("PLease enter the wind speed in miles per hour: ");
        double speed = input.nextDouble();

        //calculation
        double WC_Temp = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed,0.16)) + (0.4275 * temp * Math.pow(speed, 0.16));

        //Display the result
        System.out.println("The wind chill index is " + WC_Temp);
    }
}
