import java.util.*;

class TowerOfHanoi
{
    public static void toh(int n, int tid1, int tid2, int tid3)
    {
        if(n == 0)
        {
            return;
        }
        toh(n-1, tid1, tid3, tid2);
        System.out.println(n + "[" + tid1 + " -> " + tid2 + "]");
        toh(n-1,tid3, tid2, tid1);
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int tid1 = sobj.nextInt();
        int tid2 = sobj.nextInt();
        int tid3 = sobj.nextInt();

        toh(n,tid1,tid2,tid3);
    }
}