import java.util.*;
import java.lang.*;

class CountSay_7 
{
    static String[] a;
    public static String countAndSay(int n) 
    {
        a = new String[n];
        a[0] = "1";
        for(int i=1; i<n; i++)
        {
            a[i] = say(a[i-1]);
        }        
        return a[n-1];        
    }
    
    private static String say(String say)
    {
        int len = say.length();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<len; i++)
        {
            char c = say.charAt(i);
            int ctr = 1;
            for(int j=i+1; j<len; j++)
            {
                char r = say.charAt(j);
                if(c == r)
                {
                    i++;
                    ctr++;
                }
                else
                {
                    break;
                }
            }
            sb.append(ctr);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        if(n<1)
        {
            System.out.println("Invalid input");
            return;
        }
        String str = countAndSay(n);

        System.out.println(str);
    }
}