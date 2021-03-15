import java.util.*;

class Rotation_5
{
    public static void main(String args[]) 
    {
            Scanner sobj = new Scanner(System.in);
            System.out.println("Enter number of elements in the array.");
            int n = sobj.nextInt();

            int a[] = new int[n];

            System.out.println("Enter the sorted array.");
            for(int i=0; i<n; i++)
                a[i] = sobj.nextInt();

            System.out.println("Enter the element whose first and last location is required.");
            int x = sobj.nextInt();

            int first=0;
            int last=0;

            for(int i=0; i<n; i++)
            {
                if(x == a[i])
                {
                    first = i;
                    break;
                }
            }

            for(int i=0; i<n; i++)
            {
                if(x == a[i])
                {
                    last = i;
                }
            }

            System.out.println("First location is: " + first + " and the last location is: " + last);
    }
}