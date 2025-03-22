//package Tree1;
//
//public class Treedata {
//    static class Node{
//        int val;
//        Node left;
//        Node rigth;
//        Node(int val){
//            this.val = val;
//        }
//    }
//    private static void Display(Node root){
//        if(root == null){
//            return;
//        }
//        System.out.print(root.val +" ");
//        Display(root.left);
//        Display(root.rigth);
//    }
//    private static int Sum(Node root){
//        if(root == null){
//            return 0;
//        }
//        return root.val + Sum(root.left) + Sum(root.rigth);
//    }
//    private static int product(Node root){
//        if(root == null){
//            return 1;
//        }
//        return root.val * product(root.left) * product(root.rigth);
//    }
//    private static int Max(Node root){
//        if(root == null){
//            return 0;
//        }
//        int a = root.val;
//        int b = Max(root.left);
//        int c = Max(root.rigth);
//        return Math.max(a, Math.max(b,c));
//    }
//    private static int Min(Node root){
//        if(root == null){
//            return 0;
//        }
//        int a = root.val;
//        int b = Min(root.left);
//        int c = Min(root.rigth);
//        return Math.min(Math.min(c,b),a);
//    }
//    private static int size(Node root){
//        if(root == null){
//            return 0;
//        }
//        return 1 + Math.max(size(root.left), size(root.rigth));
//    }
//    private static int NonZeroProduct(Node root){
//        if(root== null){
//            return 1;
//        }
//        if(root.val!=0){
//            return root.val * NonZeroProduct(root.left)*NonZeroProduct(root.rigth);
//        }
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node e = new Node(0);
//        Node f = new Node(50);
//        Node g = new Node (70);
//        a.left = b; a.rigth = c;
//        b.left = e; b.rigth = f;
//        f.rigth = g;
//        Display(a);
//        System.out.println("sum is "+ Sum(a));
//        System.out.println("Product is "+ product(a));
//        System.out.println("Max is "+ Max(a));
//        System.out.println("Min is " + Min(a));
//        System.out.println("size is "+ size(a));
//        System.out.println("non zero product "+ NonZeroProduct(a));
//
//    }
//}
