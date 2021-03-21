import java.util.*;

class RotatedSearch
{
    static int binSearch(int a[], int low, int high, int key)
    {
        while(low <= high)
        {
            int mid = low + (high-low)/2;

            if(a[mid] == key)
            {
                return mid;
            }
            else if(a[mid] > key)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        if(n < 1)
        {
            System.out.println("Invalid Input");
            return;
        }

        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }
        int key = sobj.nextInt();
        int i=0;

        while(i<n-2)
        {
            if(a[i] > a[i+1])
            {
                break;
            }
            i++;
        }

        int loc1 = binSearch(a,0,i,key);
        int loc2 = binSearch(a,i+1,n-1,key);

        if(loc1 >= 0)
        {
            System.out.println("Found at: " + loc1);
        }
        else if(loc2 >= 0)
        {
            System.out.println("Found at: " + loc2);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}