import java.util.*;

class ArrayMax
{
    public static int arrMax(int a[], int n)
    {
        if(n == 1)
         return a[0];
         
        //2 32 5 11 7  
        /*
        (32)
        */

        return Math.max(a[n-1], arrMax(a, n-1));

        //(10,2) = 10
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

       System.out.println(arrMax(a,n)); 
    }
    
}