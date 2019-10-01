import java.util.Scanner;
public class Main3
{
    public static void main(String[] args)
    {
        //create a Scanner
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        //selection
        if(number == 10)
        {
            System.out.println("What's up");
        }

        else
        {
            System.out.println("Absolutely not");
        }
    }
}