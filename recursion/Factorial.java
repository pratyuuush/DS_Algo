//O(n)
import java.util.*;

class Factorial
{
    static int fact(int n)
    {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String args[]) 
    {
        System.out.println("Enter the number");
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        int factorialOfN = fact(n);

        System.out.println(factorialOfN);
    }
}