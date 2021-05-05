import java.util.*;

class DecreasingIncreasing
{
    public static void printDecInc(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        printDecInc(n);
    }
}