package Recursion;

import java.util.Scanner;

public class PowerLogByTC {
    public static int pow(int a,int b){
        if(b==0) return 1;
        int ans=pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the a : ");
        int a= sc.nextInt();
        System.out.println("enter the b : ");
        int b= sc.nextInt();
        System.out.println(pow(a,b));
    }
}
