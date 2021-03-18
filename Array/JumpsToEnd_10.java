//O(n)
import java.util.*;

class JumpsToEnd_10
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sobj.nextInt();
        }

        int count = 0;
        int i=0;

        while(i < n)
        {
            int jump = arr[i];
            i = i+jump;
            if(i != n-1)
            {
                count++;
            }      
        }

        System.out.println("Jumps: " + count);
    }
}