package Tree1;

public class TreeDataSructure {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void Display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val +" ");
        Display(root.left);
        Display(root.right);
    }
    private static int Sum(Node root){
        if(root== null){
            return 0;
        }
        return root.val + Sum(root.left) + Sum(root.right);
    }
    private static int Produt(Node root){
        if(root==null ){
            return 1;
        }
        return root.val* Produt(root.left) * Produt(root.right);
    }
    private static int Max(Node root){
        if(root == null){
            return 0;
        }
        int a = root.val;
        int b = Max(root.left);
        int c = Max(root.right);
        return Math.max(a, Math.max(b,c));
    }
    private static int Min(Node root){
        if(root == null ){
            return 0;
        }
        int a = root.val;
        int b = Min(root.left);
        int c = Min(root.right);
        return Math.min(a, Math.min(b,c));
    }
    private static int size(Node root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20 );
        Node c = new Node(30);
        Node d = new Node(40);
        Node e =  new Node(50);
        Node f = new Node(60);

        a.left = b; a.right =c;
        b.left=d; b.right = e;
        e.left = f;
        Display(a);
        System.out.println("Sum of the lement  : "+ Sum(a));
        System.out.println("Product of the bt "+ Produt(a));
        System.out.println("max element in bt "+ Max(a));
        System.out.println("min element in bt "+ Min(a));
        System.out.println("size of the Binary tree "+ size(a));
    }
}
