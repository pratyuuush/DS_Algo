//O(n)

import java.util.*;

class MinMax_2
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

        int min=a[0];
        int max=a[0];

        for(int i=1; i<n; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
            else if(a[i] < min)
            {
                min = a[i];
            }
            else
            {
                ;
            }
        }

        System.out.println("Min: " + min + " Max: " + max);
    }
}