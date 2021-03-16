//O(n)

import java.util.*;

class Dup_3
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = sobj.nextLine();
        
        int count[] = new int[256]; //Total 256 characters are there

        for(int i=0; i<str.length(); i++)
        {
            count[str.charAt(i)]++; //Counting Duplicates
        }

        for(int i=0; i<256; i++) //loop for 256 characters
        {
            if(count[i] > 1)
            {
                System.out.println((char)(i) + " count = " + count[i]);
            }
        }
    }
}