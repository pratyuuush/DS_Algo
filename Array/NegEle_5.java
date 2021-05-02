//O(n)

import java.util.*;

class NegEle_5
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

        int j = 0;
        for(int i=0; i<n; i++)
        {
            if(a[i] < 0)
            {
                b[j] = a[i];
                j++;
            }
        }

        for(int i=0; i<n; i++)
        {
            if(a[i] > 0)
            {
                b[j] = a[i];
                j++;
            }
        }

        System.out.println("Sorted array is: ");
        for(int i=0; i<n; i++)
        {
            System.out.println(b[i]);
        }
    }
}