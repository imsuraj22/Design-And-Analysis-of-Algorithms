

class Node {
    int data;
    Node left, right;
 
   
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class IsBinaryTree {
    
    static boolean isBST(Node root){
        return solution(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    static boolean solution(Node root,int min,int max){
        if(root==null) return true;

        if(root.data>=max || root.data<=min) return false;
        return solution(root.left, min, root.data) && solution(root.right, root.data, max);
    }
    
   

    public static void main(String[] args) {
      
       Node root=new Node(5);
        root.left=new Node(2);
        root.right=new Node(10);
        
        
        root.right.right=new Node(12);
        root.right.left=new Node(7);
        root.right.right.right=new Node(21);
        root.right.right.left=new Node(11);
        System.out.println(isBST(root));
    }
}
