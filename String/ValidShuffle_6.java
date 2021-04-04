//O(n)
import java.util.*;

class ValidShuffle_6
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = sobj.nextLine();
        String str2 = sobj.nextLine();
        String suffStr = sobj.nextLine();

        if(str1.length() + str2.length() != suffStr.length())
            System.out.println("Not a valid suffle");

        int i=0, j=0, k=0;

        while(k != suffStr.length())
        {
            if(i < str1.length() && str1.charAt(i) == suffStr.charAt(k))
                i++;
            else if(j < str2.length() && str2.charAt(j) == suffStr.charAt(k))
                j++;
            else
            {
                System.out.println("False");
                return;
            }
            k++;
        }

        if(i < str1.length() || j < str2.length()) 
        {
            System.out.println("False");
            return;
        }
        else
        {
            System.out.println("True");
        }
        
    }
    
}