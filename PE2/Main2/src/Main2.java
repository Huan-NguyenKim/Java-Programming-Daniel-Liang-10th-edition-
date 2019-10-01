import java.util.Scanner;
public class Main2
{
    public static void main(String[] args) {  //create a Scanner;
        Scanner input = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter a number");
        int number = input.nextInt();

        //display
        System.out.println("Your number is " +number);
    }
}