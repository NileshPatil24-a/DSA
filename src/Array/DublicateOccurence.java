package Array;

public class DublicateOccurence {
    public static void main(String[] args) {
        int a [] = {1,1,2,3,2,2,1,1,2,2,3,5,56,4,3,3,2,2};
        int n = a.length;
        int k=0;
        int b[] = new int[n];
        for(int j=0; j<n; j++){
            for(int i=j; i<n; i++){
                if(a[j]==a[i]){
                    b[k] = a[i];
                }
            }
        }
    }
}
