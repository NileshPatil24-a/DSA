package Recursion;

import java.util.Scanner;

public class MazePath {
    public static  int maze(int row,int col, int m,int n){
        if(row==n || col==m) return 1;
        int waysofright = maze(row,col+1, m,n);
        int waysofdown = maze(row+1, col,m,n);
        return waysofdown+waysofright;
    }
    public static  int maze2(int m,int n){
        if(m==1 || n==1) return 1;
        int waysofright = maze2(m,n-1);
        int waysofdown = maze2(m-1,n);
        return waysofdown+waysofright;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the m : ");
        int m = sc.nextInt();
        System.out.println("enter the n : ");
        int n = sc.nextInt();
        System.out.println(maze2(m,n));

    }
}
