//O(n)
import java.util.*;

class CyclicRotate_7
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sobj.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array ");
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        int b[] = new int[n];
        b[0] = a[n-1]; 
        for(int i=1; i<n; i++)
        {
            b[i] = a[i-1];
        }

        System.out.println("Cyclic array is: ");

        for(int i=0; i<n; i++)
        {
            System.out.println(b[i]);
        }
    }
}