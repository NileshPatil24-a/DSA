package Recursion;

import java.util.Scanner;

public class PrintByRecursion {
    public static void printnum(int n){
        if(n==0) return;
        printnum(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the num :");
        int n = sc.nextInt();
        printnum(n);
    }
}
