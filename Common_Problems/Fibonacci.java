/* O(2^n) with recursion. So we will use Dynamic programming to optimize the code

import java.util.*;

class Fibonacci
{
    public static int fibo(int n)
    {
        if(n <= 1)
            return n;

        return fibo(n-1) + fibo (n-2);
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter input n");
        int n = sobj.nextInt();
        
        for (int i = 0; i < n; i++) 
            System.out.print(fibo(i) + " "); 
    }
    
}

*/
//O(n)
import java.util.*;

class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter input n");
        int n = sobj.nextInt();

        int f[] = new int[n+2];

        f[0] = 0;
        f[1] = 1;

//0 1 1 2
        
        for(int i=2; i<=n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }

        System.out.println("Fibonacci series is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(f[i] + " ");
        }
    }
}