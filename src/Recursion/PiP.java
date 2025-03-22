package Recursion;

import java.util.Scanner;

public class PiP {
    public static void pip(int n){
        if(n==0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the n : ");
        int n = sc.nextInt();
        pip(n);
    }
}
