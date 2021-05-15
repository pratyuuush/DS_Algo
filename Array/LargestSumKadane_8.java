//O(n)

import java.util.*;

class LargestSumKadane_8
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

        //If it is mentioned that the array is sorted then this method can be applied directly else need to sort it first.

        int curSum = 0;
        int maxSum = a[0];

        for(int i=0; i<n; i++)
        {
            curSum = curSum + a[i];

            if(curSum > maxSum)
            {
                maxSum = curSum;
            }
            if(curSum < 0)
            {
                curSum = 0;
            }
        }

        System.out.println("Max Sum: " + maxSum);
    }
}