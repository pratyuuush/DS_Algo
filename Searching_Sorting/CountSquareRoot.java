import java.util.*;

public class CountSquareRoot
{ 
    static void calSqrt(int n)
    {
        int low = 0;
        int high = n;
        int ans=0,ans1=0;

        if(n == 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(n == 1)
        {
            System.out.println("0");
            return;
        }
         

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            if(mid < n/mid)
            {
                ans = mid;
                low = mid+1;
            }
            else if(mid == n/mid)
            {
                ans = mid;
                ans1 = mid;
                break;
            }
            else{
                high = mid - 1;
            }
        }
        if(ans == ans1)
        {
            System.out.println(ans-1);
        }
        else{
            System.out.println(ans);
        }
        
        
    }

    public static void main(String[] args) 
    { 
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        calSqrt(n); 
    } 
}