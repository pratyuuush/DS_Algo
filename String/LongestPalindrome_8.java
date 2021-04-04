import java.util.*;
import java.lang.*;

class LongestPalindrome_8
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();    
        
        int i=0, j=0;

        while(i<str.length())
        {
            if(j>i)
            {
                j=i;
            }
            while(j<str.length())
            {
                int k;
                for(k=i; k<=j; k++)
                {
                    
                }
                System.out.println();
                j++;
            }
            i++;
        }
    }
}