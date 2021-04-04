import java.util.*;

class ValueIndex_2
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        if(n <= 1)
        {
            System.out.println("Invalid Input");
            return;
        }

        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        System.out.println("They are: ");
        
        for(int i=0; i<n; i++)
        {
            if(a[i] == i)
            {
                System.out.println(i);
            }
        }
    }
}