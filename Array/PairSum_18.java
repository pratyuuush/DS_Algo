//O(n) This code will only work for Array with distinct elements

import java.util.*;

class PairSum_18
{

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int k = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        Arrays.sort(a);

        int count = 0;

        int i = 0;
        int j = n-1;

        while(i < j)
        {
            if((a[i] + a[j]) < k)
            {
                i++;
            }
            else if((a[i] + a[j]) > k)
            {
                j--;
            }
            else
            {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
       
    }
} 


/* O(n*n)
import java.util.*;

class PairSum_18
{

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int k = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        int count = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i < j && (a[i] + a[j] == k))
                {
                    count++;
                }
            }
        }

        System.out.println(count);
       
    }
} */