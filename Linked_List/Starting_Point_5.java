import java.util.*;

class Starting_Point_5
{
    static Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
        }
    }

    static void insertEnd(int data)
    {
        Node new_node = new Node(data);

        if(head == null)
        {
            head = new_node;
            return;
        }

        Node last = head;

        while(last.next != null)
        {
            last = last.next;
        }

        last.next = new_node;

        return;
    }

    static void insertLoop(int loc)
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }

        Node last = head;
        Node location = head;
        int count = 1;
        while(count != loc)
        {
            location = location.next;
            last = last.next;
            count++;
        }

        while(last.next != null)
        {
            last = last.next;
        }

        last.next = location;
    }

    static void printList()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node last = head;

        while(last != null)
        {
            System.out.print(last.data + " ");
            last = last.next;
        }

        System.out.println();
    }

    static void startingPoint()
    {
        if(head == null || head.next == null)
        {
            System.out.println("No loop found");
            return;
        }

        HashMap<Node, Integer> hm = new HashMap<Node, Integer>();

        Node nextData = head;

        while(nextData.next != null)
        {
            int data = nextData.data;

            if(hm.containsKey(nextData))
            {
                System.out.println(nextData.data);
                return;
            }

            hm.put(nextData, data);
            nextData = nextData.next;
        }

    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int data = sobj.nextInt();
            insertEnd(data);
        }

        int loc = sobj.nextInt();
        insertLoop(loc);


        startingPoint();
    }
}