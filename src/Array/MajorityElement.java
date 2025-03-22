package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int a [] = {1, 1, 2, 1, 3, 5, 1};
        int n  =a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(a[n/2]);
    }
}
