import java.util.ArrayList;

public class pracice {
    private  static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static int Sum(Node root){
        if(root==null) return 0;
        int leftNode = Sum(root.left);
        int  rightNode = Sum(root.right);
        return root.val + leftNode+rightNode;
    }
    private static void NthLevel(Node root,int level){
        if(root==null) return;
        if(level==2){
            System.out.println(root.val);
        }
        NthLevel(root.left,level+1);
        NthLevel(root.right,level+1);
    }
    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.left = b; a.right = c;
        b.left = d; b.right=e;
        System.out.println(Sum(a));
        NthLevel(a,1);
    }
}
