package JavaPractice;

import java.util.Scanner;

public class SVD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the m : ");
        int m= sc.nextInt();
        System.out.println("enter the n : ");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("enter : "+(i+1)+","+(j+1)+": ");
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
//        Trnaspose of matrxi
        int b[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("your v is : AtA ");
        int c[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println("now we have char.equation ");
            System.out.println("a^2-s1a+|D|=0");
            int s1= c[0][0]+c[1][1];
            System.out.println("s1= "+(s1));
            int d = c[0][0]*c[1][1] - c[1][0]*c[0][1];
            System.out.println("|d|= "+d);
            System.out.println();
            System.out.println(" your char.equation is = c^2"+(-(s1))+"c + ("+d+")="+0);

        int discriminant = s1*s1 - 4*d;
        if (discriminant >= 0) {
            double r1 = (-s1 + Math.sqrt(discriminant)) / 2;
            double r2 = (-s1 - Math.sqrt(discriminant)) / 2;
            System.out.println("a1 = " + r1);
            System.out.println("a2 = " + r2);
        } else {
            System.out.println("No real roots, discriminant is negative.");
        }

    }
}
