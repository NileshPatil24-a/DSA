package Trees;

import jdk.swing.interop.DispatcherWrapper;

class Node2{
    int val;
    Node2 left;
    Node2 rigth;
    Node2(int val){
        this.val = val;
    }
}
public class Minimumnumber {
    private static int size(Node2 root){
        if(root ==null ) return 0;
        return 1+ size(root.left)+ size(root.rigth);
    }
    private static void Dislpy(Node2 root){
        if(root==null) return;
        System.out.print(root.val+ " ");
        Dislpy(root.left);
        Dislpy(root.rigth);
    }
    private static int MinNo(Node2 root){
        if(root == null ) return Integer.MAX_VALUE;
        int a = root.val;
        int d = MinNo(root.left);
        int e = MinNo(root.rigth);
        return Math.min(a,Math.min(e,d));
    }
    public static void main(String[] args) {
        Node2 a = new Node2(10);
        Node2 c = new Node2(20);
        Node2 d = new Node2(-1);
        Node2 e = new Node2(40);
        Node2 f= new Node2(50);

        a.left = c; a.rigth= d;
        d.left=e; d.rigth =  f;
        Dislpy(a);
        System.out.println("Minimum Nober is "+ MinNo(a));
        System.out.println("size of the tree  " + size(a));
    }
}
