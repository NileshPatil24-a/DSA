package codechef;

import java.util.Scanner;

public class Matrixmultiplaction {
    public static void main(String[] args) {
        System.out.println("Matrix multiplaction ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Matrxi A  row1 : ");
        int row1 = sc.nextInt();
        System.out.println("enter the col1: ");
        int col1 = sc.nextInt();
        System.out.println("enter the Matrix B row2 :  ");
        int row2 = sc.nextInt();
        System.out.println("enter the col2 : ");
        int col2 = sc.nextInt();

        int A[][] = new int[row1][col1];
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                System.out.println("enter MatrxA : "+i+" , "+ j + " : ");
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }

        int B[][] = new int [row2][col2];
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                System.out.println("enter MatrxB : "+i + " , "+ j + " : ");
                B[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                System.out.print(B[i][j]);
            }
            System.out.println();
        }

        int C [][]  = new int [row1][col1];
        for(int i = 0; i<row1; i++){
            for (int j = 0; j<col1; j++){
                C[i][j] = 0;
                for (int k=0; k<col1; k++){
                    C[i][j] = C[i][j]+ A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i<row1; i++){
            for (int  j =0; j<col1; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}
