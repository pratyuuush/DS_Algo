import java.util.*;
import java.util.Stack;

class StackCollectionClass
{
    public static void main(String args[]) 
    {
        Stack<Integer> st = new Stack<Integer>();

        st.push(10);
        st.push(20);

        for(int i=0; i<st.size(); i++)
            System.out.print(st.get(i) + " ");

            //All the methods of Linked List works here.

    }
}