package Array;

public class SortArray {
    public static void main(String[] args) {
        int a [] = {1,-3,0,59,4,3,2,1};
        int n =a.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n-1;  j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int ele : a){
            System.out.print(ele +" ");
        }
    }
}
