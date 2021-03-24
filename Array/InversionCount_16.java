import java.util.*;

class InversionCount_16
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        int count=0;
        
        for(int i=0; i<n; i++)
            a[i] = sobj.nextInt();
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i != j && i < j)
                {
                    if(a[i] > a[j])
                    {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}