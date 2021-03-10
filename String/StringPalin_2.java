import java.util.*;
import java.lang.*;

class StringPalin_2
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();
        int i = 0;
        int j = str.length() - 1;
        int count = 0;

        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("Not a palindrome");
                count++;
                break;
            }
            i++;
            j--;
        }

        if(count == 0)
        {
            System.out.println("Palindrome");
        }
    }
}