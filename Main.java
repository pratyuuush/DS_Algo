import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    static Node root;

    Main()
    {
        root = null;
    }
    static class Node
    {
        int data;
        Node left, right;

        Node(int d)
        {
            left = right = null;
            data = d;
        }
        
    }

    static void inOrder(Node root)
    {

        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    static void preOrder(Node root)
    {
        

        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
      

    }

    static void postOrder(Node root)
    {
       

        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        

    }

    //BST Insertion
    static Node insertRec(Node root, int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }

        if(key > root.data)
        {
            root.right = insertRec(root.right, key);
            return root;
        }
        else if(key < root.data)
        {
            root.left = insertRec(root.left,key);
            return root;
        }
        
        return root;

    
    }
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        for(int i=0; i<n; i++)
        {
            int data = sobj.nextInt();
            root = insertRec(root, data);
        }
        System.out.println("Inorder");
        inOrder(root);
        System.out.println();
        System.out.println("Preorder");
        preOrder(root);
        System.out.println();
        System.out.println("Postorder");
        postOrder(root);
    }
}