//O(n*n)
import java.util.*;


class LongestPalindrome_8
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();    
        int len = 0;
        int resI = 0, resJ = 0;
        boolean dp[][] = new boolean[str.length()][str.length()];

        for(int g=0; g<str.length(); g++)
        {  
            for(int i=0, j=g; j<str.length(); i++, j++)
            {
                if(g == 0)
                {
                    dp[i][j] = true;
                }
                else if(g == 1)
                {
                    if(str.charAt(i) == str.charAt(j))
                    {
                        dp[i][j] = true;
                    }
                    else
                    {
                        dp[i][j] = false;
                    }
                }
                else
                {
                    if((str.charAt(i) == str.charAt(j)) && dp[i+1][j-1] == true)
                    {
                        dp[i][j] = true;
                    }
                    else
                    {
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j])
                {
                    resI = i;
                    resJ = j; 
                }
            }
        }
        for(int i=resI; i<=resJ; i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}