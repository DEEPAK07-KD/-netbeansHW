package binarytree;
 
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

 
    public static void main(String[] args) {
        Node r = new Node(8);
        Node n1 = new Node(4);
        Node n2 = new Node(12);
        Node n3 = new Node(2);
        Node n4 = new Node(6);
        Node n5 = new Node(10);
        Node n6 = new Node(14);
        
        r.left = n1;
        r.right = n2;
        
        n1.left = n3;
        n1.right = n4;
        
        n2.left = n5;
        n2.right = n6;
        
        System.out.println("Binary Tree Created Successfully!");
        
        System.out.print("Preorder : ");
        preorder(r);
        System.out.println();
        
        System.out.print("Inorder : ");
        inorder(r);
        System.out.println();
        
        System.out.print("Postorder : ");
        postorder(r);
        System.out.println();
        
        System.out.print("Levelorder : ");
        levelorder(r);
        System.out.println();
    }
    public static void preorder(Node root){
        if (root == null) 
            return;
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
     public static void inorder(Node root){
        if (root == null) 
            return;
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }
     
     public static void postorder(Node root){
        if (root == null) 
            return;
        
        
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }
     
     public static void levelorder(Node root){
        if (root == null) 
            return;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
             Node n = q.poll();
             System.out.print(n.data + " ");
             if (n.left != null) 
                 q.add(n.left);
             if (n.right != null) 
                q.add(n.right);
         }
    }
}
