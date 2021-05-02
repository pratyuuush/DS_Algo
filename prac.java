import java.util.*;
import java.lang.*;


class prac 
{

    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int N = sobj.nextInt();

        if(N < 100)
        {
            System.out.println("Normal Number");
            return;
        }

        int countDig = 0;

        for (; N != 0; N /= 10, ++countDig) {
        }

      

        if(N<100)
        {
            System.out.println("Normal Number");
            return;
        }
        else if(N>100 && countDig%2 != 0)
        {
            System.out.println("Pseudo Uncanny");
            return;
        }
        else if(N>100 && countDig%2 == 0)
        {
            System.out.println("Truly Uncanny");
            return;
        }



    }
}