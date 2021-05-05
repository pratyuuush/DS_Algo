import java.util.*;

class PrintingN
{

    public static void printN(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        printN(n-1);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        printN(n);
    }
}