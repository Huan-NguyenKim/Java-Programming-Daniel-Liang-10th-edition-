
/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi


			 Note that we will use import java.lang.Math.*;    to get Pi.
			 The formula is Math.PI
			 Radius = 5.5
*/
import java.lang.Math.*;
public class PE_1_8
{
    public static void main(String[] args)
    {
        System.out.println("Perimeter = " + 2 * 5.5 *Math.PI);
        System.out.println("Area = " + 5.5 * 5.5 *Math.PI);
    }
}
