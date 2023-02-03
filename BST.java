import java.util.Scanner;

class Node {
    int data;
    Node left, right;
 
   
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class BST {
    
    Node root;
    
    void insert(int val){
        root=insertRecur(root,val);
    }

    Node insertRecur(Node root,int val){
        if(root == null){
            root=new Node(val);
            return root;
        }
        else if(val<root.data){
            root.left=insertRecur(root.left, val);
        }
        else if(val>root.data){
            root.right=insertRecur(root.right, val);
        }
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(" ->"+root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST bst=new BST();
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number of nodes ");
        n=sc.nextInt();
        int node=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the node "+i);
            node=sc.nextInt();
            bst.insert(node);
        }

        bst.inorder();
    }
}
