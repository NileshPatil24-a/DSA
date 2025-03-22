package Recursion;

import java.util.Scanner;

public class SumByRecursiveMethod {
    public static int sum(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num : ");
        int n = sc.nextInt();
        System.out.println( sum(n));
    }
}
