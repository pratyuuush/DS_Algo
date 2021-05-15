import java.util.*;

class LongestCommonSubStr
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = sobj.nextLine();
        String str2 = sobj.nextLine();
       

        int dp[][] = new int[str1.length()+1][str2.length()+1];
        int maxLen = 0;
        for(int i=1; i<dp.length; i++)
        {
            for(int j=1; j<dp[0].length; j++)
            {
                char c1 = str1.charAt(i-1);
                char c2 = str2.charAt(j-1);
                
                if(c1 == c2)
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    if(dp[i][j] > maxLen)
                    {
                        maxLen = dp[i][j];
                    }
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println(maxLen);
    }
}