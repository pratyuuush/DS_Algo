//O(logn)
import java.util.*;

class F_L_Occ_1
{

    static void firstLast(int n, int x, int a[])
    {
        int first = 0;
        int last = n-1;
        int focc = -1;
        int locc = -1;

        

        //for first occurrence
        while(first <= last)
        {
            int mid = first + (last-first)/2;
            if(a[mid] == x)
            {
                focc = mid;
                last = mid-1;
            }
            else if(a[mid] > x)
            {
                last = mid-1;
            }
            else
            {
                first = mid+1;
            }
        }
        //for last occurrence
        first = 0;
        last = n-1;
        while(first <= last)
        {
            int mid = first + (last-first)/2;
            if(a[mid] == x)
            {
                locc = mid;
                first = mid+1;
            }
            else if(a[mid] > x)
            {
                last = mid-1;
            }
            else
            {
                first = mid+1;
            }
        }
        System.out.println("First occurrence is " + focc);
        System.out.println("Last occurrence is " + locc);
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();
        int x = sobj.nextInt();

        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        firstLast(n,x,a);

    }
}