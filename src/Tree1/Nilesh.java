package Tree1;

public class Nilesh {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void Diplay(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        Diplay(root.left);
        Diplay(root.right);

    }
    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
        return root.val + Sum(root.left) + Sum(root.right);
    }
    public static int Max(Node root){
        if(root==null) return 0;
        int a= root.val;
        int b = Max(root.left);
        int c= Max(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static int Min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int a= root.val;
        int b= Min(root.left);
        int c= Min(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static int Product(Node root){
        if(root==null){
            return 1;
        }
        int a =  root.val;
        int b = Product(root.left);
        int c = Product(root.right);
        return a*b*c;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(40);
        Node e = new Node(50);
        Node f= new Node(60);
        a.left  = b; a.right = c;
        b.left = e; b.right = f;
        Diplay(a);
        System.out.println(Sum(a));
        System.out.println(Max(a));
        System.out.println(Min(a));
        System.out.println(Product(a));
    }
}
