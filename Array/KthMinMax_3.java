//O(n)

import java.util.*;

class KthMinMax_3
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
        System.out.println("Enter k");
        int k = sobj.nextInt();

        Arrays.sort(a);

        System.out.println("Kth min " + a[k-1]);
        System.out.println("Kth max " + a[n-k]);
    }

}