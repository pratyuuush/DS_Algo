class Tree_Traversal
{
    static class Node
    {
        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    public Node insertTree(int data)
    {
        Node new_node = new Node(data);
        return new_node;
    }

    public void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root)
    {
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);   
            System.out.print(root.data + " ");
        }
    }

    public void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);   
        }
    }

    public static void main(String args[])
    {
        Tree_Traversal tt = new Tree_Traversal();
        Node root = tt.insertTree(4);
        Node new_node = tt.insertTree(1);
        Node new_node_1 = tt.insertTree(6);
        Node new_node_2 = tt.insertTree(5);
        Node new_node_3 = tt.insertTree(2);

        root.left = new_node;
        root.right = new_node_1;
        new_node.left = new_node_2;
        new_node.right = new_node_3;

        tt.preOrder(root);
        System.out.println();
        tt.postOrder(root);
        System.out.println();
        tt.inOrder(root);
        System.out.println();
        
    }
}