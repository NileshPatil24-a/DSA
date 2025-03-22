package codechef;

public class NegativeCounter {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{-3,-4,9},{5,-7,8}};
        int N = a.length;
        int M = a[0].length;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(a[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
