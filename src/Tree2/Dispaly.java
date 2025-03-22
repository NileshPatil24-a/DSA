package Tree2;

public class Dispaly {
    private static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void print(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }
    private static int Sum(Node root){
        if(root==null) return 0;
        return root.val + Sum(root.left)+Sum(root.right);
    }
    private static int Max(Node root){
        if(root == null) return 0;
        int a = root.val;
        int b = Max(root.left);
        int c = Max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    private static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node (30);
        Node e = new Node(40);
        Node f = new Node(50);
        a.left = b; a.right =c;
        b.left = e; b.right= f;
        print(a);
        System.out.println("sum is ");
        System.out.println(Sum(a));
        System.out.println(Max(a));
        System.out.println(size(a));
    }
}
