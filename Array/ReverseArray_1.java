//O(n)
import java.util.*;

class ReverseArray_1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sobj.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array ");
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        int b[] = new int[n];

        System.out.println("Reversed array");
        int i=0;
        int j=n;
        while(i<n)
        {
            b[j] = a[i];
            j--;
            i++;
        }

        for(i=0; i<n; i++)
        {
            System.out.println(b[i]);
        }
    }
}