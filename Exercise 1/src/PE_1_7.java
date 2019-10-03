/**
 * +Display the result of 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * +Display the result of 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * Note that we will use 1.0 instead of 1 for a second formula.
 */


public class PE_1_7
{
    public static void main(String[] args)
    {
        System.out.println(4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11));
        System.out.println(4*(1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));

    }
}
