package Array;

public class Reverse {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,5,6};
        int n = a.length;
        for(int i=0; i<n/2; i++){
            int temp1  = a[i];
            a[i] = a[n-i-1];
            a[n-i-1]= temp1;
        }
        for(int ele : a){
            System.out.print(ele + " ");
        }
    }
}
