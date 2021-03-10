//O(n)
import java.util.*;

class PrimeNum
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();    

        int count=0;
        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("Not a prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}