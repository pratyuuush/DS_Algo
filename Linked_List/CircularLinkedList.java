import java.util.*;

class CircularLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = head;
        }
    }

    public void printList()
    {
        Node n = head;

        if(n == null)
        {
            System.out.println("List is empty");
        }

        while(n != null)
        {
            System.out.println(n.data + " ");
            n = n.next;
        }   
    }

    public void insertBeginning(int data)
    {
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;

    }

    public static void main(String args[]) 
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        cll.head.next = second;
        second.next = third;

        cll.printList();
    }
}