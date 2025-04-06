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
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.left = b; a.right = c;
        b.left = d; b.right=e;
        System.out.println(Sum(a));
    }
}
