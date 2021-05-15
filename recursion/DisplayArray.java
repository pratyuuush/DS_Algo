import java.util.*;

class DisplayArray
{
    public static void printArr(int n, int a[])
    {
        if(n == 0)
        {
            return;
        }

        printArr(n-1,a);
        System.out.println(a[n-1]);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        printArr(n,a);

    }
}