import java.util.*;

class Power
{
    public static int powerXN(int x, int n)
    {
        if(n == 0)
            return 1;
        
        int xpnb = powerXN(x,n/2);
        int xn = xpnb*xpnb;

        if(n%2 == 1)
        {
            xn = xn*x;
        }
     
        return xn;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int x = sobj.nextInt();
        int n = sobj.nextInt();
        
        System.out.println(powerXN(x,n));
       
        
    }
}

/*import java.util.*;

class Power
{
    public static int powerXN(int x, int n)
    {
        if(n == 1)
            return x;
        
        return x*powerXN(x,n-1);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int x = sobj.nextInt();
        int n = sobj.nextInt();

        System.out.println(powerXN(x,n));
        
    }
}*/