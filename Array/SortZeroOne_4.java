//Time complexity is O(n)

import java.util.*;

class SortZeroOne_4
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

        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for(int i=0; i<n; i++)
        {
            switch(a[i])
            {
                case 0:
                        cnt0++;
                        break;
                case 1:
                        cnt1++;
                        break;
                case 2:
                        cnt2++;
                        break;
            }
        }

        int i=0;

        while(cnt0 > 0)
        {
            a[i++] = 0;
            cnt0--;
        }
        
        while(cnt1 > 0)
        {
            a[i++] = 1;
            cnt1--;
        }

        
        while(cnt2 > 0)
        {
            a[i++] = 2;
            cnt2--;
        }

        System.out.println("Sorted array is: ");
        for(i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
       
    }
}