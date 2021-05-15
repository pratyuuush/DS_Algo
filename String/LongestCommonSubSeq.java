import java.util.*;

class LongestCommonSubSeq
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        String str1 = sobj.nextLine();
        String str2 = sobj.nextLine();

        int dp[][] = new int[str1.length()+1][str2.length()+1];

        for(int i=dp.length-2; i>=0; i--)
        {
            for(int j=dp[0].length-2; j>=0; j--)
            {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(j);

                if(c1 == c2)
                {
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}