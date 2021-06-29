//O(logn)
import java.util.*;

class BinarySearch
{
    public static void binarySearch(int a[], int key, int n)
    {
        int low = 0; 
        int high = n-1;

        while(low <= high)
        {
            int mid = low + (high-low)/2; 

            if(a[mid] == key)
            {
                System.out.println("Item found at: " + mid);
                return;
            }
            else if(a[mid] < key)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        System.out.println("Item not found");
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sobj.nextInt();    

        int key = sobj.nextInt();

        binarySearch(a,key,n);
        
    }
}




class Imran
{
    void sum(int a, int b) //1
    {
        //Statements
    } 

    void sum(int a, int b, int c) //2
    {
        //Statements
    }

    void sum(double a, double b)//3
    {
        //Statements
    }

    public static void main(String args[])
    {
        sum(1,2);
        sum(1,2,3);
        sum(1.1,2.3);
    }


}


