/*
import java.util.*;

class RecursionPrintN
{
    static void printN(int n, int i)
    {
        if(n < 1)
        {
            return;
        }
        System.out.println(i);
        i++;
        printN(n-1,i);
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int i = 1;
        
        printN(n,i);
    }
}
*/

import java.util.*;

class RecursionPrintN
{
    static void printN(int n)
    {
        if(n < 1)                             
        {
            return;
        }
        printN(n-1);
        System.out.println(n);
        
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        
        printN(n);
    }
}




