package TreePractice;

public class Sum {
    static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int prod(Node root){
        if(root==null) return 1;
        return  root.val * prod(root.left)*prod(root.right);
    }
    public static int prodnozero(Node root){
        if(root==null) return 1;
        if(root.val==0) return prodnozero(root.left)*prodnozero(root.right);
        return root.val*prodnozero(root.left)*prodnozero(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.left = b; a.right=c;
        b.left = d; b.right = e;
        System.out.println(sum(a));
        System.out.println(prod(a));
        System.out.println(prodnozero(a));
        System.out.println(max(a));
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
}
