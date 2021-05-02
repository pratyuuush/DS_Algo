import java.util.*;

class Pair //User defined datatype to hold two integer values
{
    int x, y;

    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

class MergeIntervals_14
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int len = sobj.nextInt();    
        Pair arr[] = new Pair[len]; //creating array with Pair datatype

        for(int i=0; i<len; i++) //Taking the input in pairs
        {
            int a = sobj.nextInt();
            int b = sobj.nextInt();
            arr[i] = new Pair(a,b);
        }

        System.out.println("The values are:");
        int i=0;
        while(i<len && i != len-1) //Checking the merger
        {
            if(arr[i].y > arr[i+1].x || arr[i].y == arr[i+1].x)
            {
                System.out.println(arr[i].x + "," + arr[i+1].y);
                i = i+2;
            }
            else
            {
                System.out.println(arr[i].x + "," + arr[i].y);
                i++;
            }
        }

        while(i < len) //Printing the remaining 
        {
            System.out.println(arr[i].x + "," + arr[i].y);
            i++;
        }

            
    }
}