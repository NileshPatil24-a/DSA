package Recursion;

import java.util.Scanner;

public class PrintSum1ToN {
    public static void  sumfun(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sumfun(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num : ");
        int n = sc.nextInt();
        sumfun(n,0);
    }
}
