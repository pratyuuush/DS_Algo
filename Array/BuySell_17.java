//O(n)
import java.util.*;

class BuySell_17
{

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        int least = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for(int i=0; i<n; i++)
        {
            if(a[i] < least)
            {
                least = a[i];
            }

            profit = a[i] - least;

            if(maxProfit < profit)
            {
                maxProfit = profit;
            }
        }
        
        System.out.println(maxProfit);
       
    }
}
/*O(n*n)
import java.util.*;

class BuySell_17
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        int buy, sell;
        int maxProfit = 0;
        int profit;

        for(int i=0; i<n-1; i++)
        {
            for(int j=1; j<n; j++)
            {
                buy = a[i];
                sell = a[j];

                if(i<j)
                {
                    profit = sell-buy;

                    if(profit > maxProfit)
                    {
                        maxProfit = profit;
                    }
                }
                
            }
        }

        System.out.println(maxProfit);
    }
}*/