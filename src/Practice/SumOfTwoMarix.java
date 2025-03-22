package Practice;

import java.util.Scanner;

public class SumOfTwoMarix {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enetr the N ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[][] = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j =0; j<M; j++){
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
