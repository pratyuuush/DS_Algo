import java.util.*;

class InsertionDeletionAtSpecific
{

    static void InsertAtLoc(int n, int a[], int data, int loc)
    {
        for(int i=n; i>=loc; i--)
        {
            a[i+1] = a[i];
        }

        a[loc] = data;

       
    }

    static void DeletionAtLoc(int n, int a[], int loc)
    {
        for(int i=loc; i<n; i++)
        {
            a[i] = a[i+1];
        }
    }

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter n");
        int n = sobj.nextInt();

        int a[] = new int[n+2];

        System.out.println("Enter array");
        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        System.out.println("The array is:");
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }

        int loc;
        System.out.println("Enter the data and the location to enter the data");
        int data = sobj.nextInt();
        loc = sobj.nextInt();

        InsertAtLoc(n,a,data,loc);

        System.out.println("The array is:");
        for(int i=0; i<n+1; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Enter the location to delete the data");
        loc = sobj.nextInt();

        DeletionAtLoc(n,a,loc);
        System.out.println("The array is:");
        for(int i=0; i<n-1; i++)
        {
            System.out.println(a[i]);
        }

    }
}