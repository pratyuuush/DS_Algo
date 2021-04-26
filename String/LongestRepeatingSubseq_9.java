//O(n*n)
import java.util.*;
import java.lang.*;

class LongestRepeatingSubseq_9
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();    

        int n=str.length();
        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
    
        System.out.println(dp[n][n]);
    }
}



//N is total elements, arr is the array, newArr is new array and K is the loc of element

