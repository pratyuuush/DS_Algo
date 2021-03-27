import java.util.*;
import java.util.LinkedList;

//ArrayList also uses almost same methods

//Collection Class Implementation
class LinkedListCollectionClass
{
    public static void main(String args[]) 
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10); //Adds element in the last
        ll.addFirst(30);
        ll.addLast(40); 
        ll.addFirst(70);
        ll.addLast(80); 
        ll.addFirst(70);
        ll.addLast(80); 
        ll.add(1,20);
        ll.remove(2);
        //removeFirst(), removeLast(), set(index,data), size(),indexOf(element),lastIndexOf(element), getFirst(), getLast()

      //push, pop

        for(int i=0; i<ll.size(); i++) //Iteration
        {
            System.out.print(ll.get(i) + " ");
        }
    }
}