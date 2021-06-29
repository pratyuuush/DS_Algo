import java.util.*;

public class ArraySor 
{
    public static void main(String []args)
    {

        Scanner sobj = new Scanner(System.in);     

        int n = sobj.nextInt();
        int arr[] = new int[n];

        System.out.println("contents of array");

        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sobj.nextInt();
        }
                 
        int j = 0;
        int b[] = new int[n];

        for(int i=0; i<n; i++)
        {
            if(arr[i] < 0)
            {
                b[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<n; i++)
        {
            if(arr[i] > 0)
            {
                b[j] = arr[i];
                j++;
            }
        }


        for(int i=0; i<n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}