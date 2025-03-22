package Recursion;

import java.util.Scanner;

public class Print1ToNWithParameter {
    public static void print1ton(int n,int num){
        if(n>num) return;
        System.out.println(n);
        print1ton(n+1,num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the num : ");
        int num = sc.nextInt();
        print1ton(1,num);
    }
}
