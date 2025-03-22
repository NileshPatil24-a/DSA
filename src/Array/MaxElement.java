package Array;

public class MaxElement {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,5,6};
        int n = a.length;
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i<n;i++){
            if(a[i]<temp){
                temp = a[i];
            }
        }
        System.out.println(temp);
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
