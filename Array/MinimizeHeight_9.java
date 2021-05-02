//O(n)

import java.util.*;

class MinimizeHeight_9
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

        System.out.println("Enter k: ");
        int k = sobj.nextInt();

        int diff = a[n-1] - a[0];
        int min = a[0] + k;
        int max = a[n-1] - k;
        int temp = 0;
        
        if(min > max)
        {
            temp = min;
            min = max;
            max = temp;
        }

        for (int i = 1; i < n-1; i++)
        {
            int differ = a[i] - k;
            int sum = a[i] + k;
            if (differ >= min || sum <= max)
                continue;
            if (max - differ <= sum - min)
                min = differ;
            else
                max = sum;
        }
        int gap = Math.min(diff, max - min);

        System.out.println("Minimum difference: " + gap);
       
    }
}