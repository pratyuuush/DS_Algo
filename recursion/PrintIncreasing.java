import java.util.*;

class PrintIncreasing
{
    public static void printInc(int n)
    {
        if(n == 0)
        {
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        printInc(n);
    }
}