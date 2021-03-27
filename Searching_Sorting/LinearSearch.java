//O(n)
import java.util.*;

class LinearSearch
{
    public static int linearSearch(int a[], int key, int n)
    {
        for(int i=0; i<n; i++)
        {
            if(a[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sobj.nextInt();    

        int key = sobj.nextInt();

        int loc = linearSearch(a,key,n);

        if(loc == -1)
        {
            System.out.println("Item not found");
        }
        else
        {
            System.out.println("Item found at: " + loc);    
        }
        
    }
}