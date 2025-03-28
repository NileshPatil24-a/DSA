package Recursion;

import java.util.Scanner;

public class FactorialOfN {
    public static int fact(int n){
        if(n<0){
            return -1;
        }
        if(n==1 || n==0){
            return 1;
        }
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the num : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
        if(fact(n)==-1){
            System.out.println("do not find the factorial of negative num");
        }
    }
}
