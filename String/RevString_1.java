import java.util.*;
import java.lang.*;

class RevString_1
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();
        System.out.println("String is: " + str);

        char ch[] = str.toCharArray();

        for(int i=ch.length-1; i>=0; i--)
            System.out.print(ch[i]);
    }
}

/* 
import java.util.*;
import java.lang.*;

class RevString_1
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sobj.nextLine();
        StringBuffer str = new StringBuffer();
        str.append(str1);
        System.out.println("String is: " + str);

        str.reverse();

        System.out.println("Reversed String is: " + str);
    }
}
*/