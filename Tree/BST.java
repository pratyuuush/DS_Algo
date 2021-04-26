class BST {
 
    class Node
    {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    static Node root;
 
    BST()
    {
         root = null;
    }
    
    Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
       
        return root;
    }
 
    public void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);   
        }
    }
    
    public static void main(String[] args)
    {
        BST tree = new BST();
 
      
        root = tree.insertRec(root, 50);
        root = tree.insertRec(root, 30);
        root = tree.insertRec(root, 20);
        root = tree.insertRec(root, 40);
        root = tree.insertRec(root, 70);
        root = tree.insertRec(root, 60);
        root = tree.insertRec(root, 80);
 
        tree.inOrder(root);
    }
}