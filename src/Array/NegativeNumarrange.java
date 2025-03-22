package Array;

public class NegativeNumarrange {
    public static void main(String[] args) {
        int a [] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
