package Array;

public class CyclicRotedArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int n  = a.length;
//        int b [] = new int[n];
//        b[0]= a[n-1];
//        int k=0;
//        for(int i=1; i<n; i++){
//            b[i] = a[k++];
//        }
//        for(int ele : b){
//            System.out.print(ele + " ");
//        }
        int last = a[n-1];
        for(int i = n-1; i>0; i--){
            a[i] = a[i-1];
        }
        a[0]= last;
        for(int ele : a){
            System.out.print(ele +" ");
        }
    }
}
