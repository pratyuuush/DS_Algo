//O(n)
import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int rem, rev=0;
        
        System.out.println("Enter n: ");
        int n = sobj.nextInt();

        int temp = n;

        while(n>0)
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        if(temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}


/*
str = maam  
cpyStr=""

for i=str.length() - 1 to 0

cpyStr = str.charAt


*/