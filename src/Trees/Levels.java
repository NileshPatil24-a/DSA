package Trees;

public class Levels {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int level(Node root){
        if(root== null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e = new Node(50);
        Node f= new Node(60);
        Node g = new Node(70);
        a.left = b; a.right = c;
        b.left= d; b.right = e;
        e.left = f; f.left=g;
        System.out.println(level(a));
    }
}
