import java.util.*;

class Main
{
    int num1, num2;

    Main(int a, int b)
    {
        num1 = a;
        num2 = b;
    }

    void display()
    {
        System.out.println("a:" + num1 + " b: " + num2);
    }
}

class Solution
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = sobj.nextInt();
        int b = sobj.nextInt();

        Main mobj = new Main(a,b);
        mobj.display();
    }
}