class Node {
    int data;
    Node left, right;
 
   
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class CountNumberOfNodes {

    static int countNodes(Node root){
        if(root==null) return 0;
       return (countNodes(root.left)+countNodes(root.right))+1;
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(10);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(12);
        root.right.right=new Node(21);
        root.right.left=new Node(11);
        System.out.println(countNodes(root));
    }
}
