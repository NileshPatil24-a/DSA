package Trees;

class Node{
    Node left;
    Node rigth;
    int val;
    Node(int val){
        this.val = val;
    }

}
public class NodeOfTree {
    public static void Dispaly(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        Dispaly(root.left);
        Dispaly(root.rigth);
    }
    public static int  FindSum(Node root){
        if(root == null) return 0;
        return root.val + FindSum(root.left) + FindSum(root.rigth);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.left=b; a.rigth=c;
        b.left=d; b.rigth=e;
        c.rigth=f;
        Dispaly(a);
        System.out.println();
        System.out.println(FindSum(a));
    }
}
