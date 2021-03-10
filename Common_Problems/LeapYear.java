//O(1)
import java.util.*;

class LeapYear
{
    public static void main(String args[])
    {
        System.out.println("Enter the year");
        
        Scanner sobj = new Scanner(System.in);
        int year = sobj.nextInt();

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }  
}