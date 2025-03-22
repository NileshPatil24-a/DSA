package Trees;

class Node1 {
    int val;
    Node1 left;
    Node1 right;

    Node1(int val) {
        this.val = val;
    }
}

public class ProductOfTreeNode {
    private static void Display(Node1 root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        Display(root.left);
        Display(root.right);
    }

    private static int Product(Node1 root) {
        if (root == null) return 1; // Base case should return 1 for product calculation
        return root.val * Product(root.left) * Product(root.right);
    }
    private static int NonZero(Node1 root){
        if(root==null) return 1;
        if(root.val==0){
            return  NonZero(root.left) * NonZero(root.right);
        }
        return root.val * NonZero(root.left) * NonZero(root.right);
    }
    private static int  Maximum(Node1 root){
        if(root == null ) return Integer.MIN_VALUE;
        int a= root.val;
        int b = Maximum(root.left);
        int c = Maximum(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static void main(String[] args) {
        Node1 a = new Node1(10);
        Node1 b = new Node1(0);
        Node1 c = new Node1(30);
        Node1 d = new Node1(40);

        a.left = b;
        a.right = c;
        b.left = d;

        Display(a);
        System.out.println(); // Preorder a newline for better readability
        System.out.println("Product of tree nodes: " + Product(a));
        System.out.println(Maximum(a)+" ");
    }
}
