import java.util.*;

class SumOfN
{
    public static int sumOf(int n)
    {
        if(n<=1)
        {
            return 1;
        }

        return n  + sumOf(n-1);
        
        
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        
        System.out.println(sumOf(n));
    }
    
}