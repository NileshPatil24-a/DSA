package Array;

public class Findtherowwithmaximumnumberof1s {
    public static void main(String[] args) {
        int a [][] = {{0 ,1 ,1 ,1},{0 ,0 ,1 ,1}, {1 ,1 ,1 ,1},{0 ,0, 0 ,0}};
        int n  = a.length;
        int max = 0;
        int count=0;
        int k=0;
        for(int i=0; i<n; i++){
            max = Math.max(max,count);
            count = 0;
            for(int j=0; j<n; j++){
                if(a[i][j] == 1)count++;
                if(count>max){
                    k= i;
                }
            }
        }
        System.out.println(max);
        System.out.println(k);
    }
}
