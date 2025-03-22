package Recursion;

import java.util.Scanner;

public class BinaryString {
    public static void printstring(String s, int n){
        int m= s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printstring(s+1,n);
            printstring(s+0,n);

        }else {
            printstring(s+0,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the n : ");
        int n = sc.nextInt();
        printstring("",n);
    }
}
