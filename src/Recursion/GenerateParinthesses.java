package Recursion;

import java.util.Scanner;

public class GenerateParinthesses {
    public static void printParenthesses(int open, int close, int n, String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) printParenthesses(open+1,close,n,s+"(");
        if(close<open) printParenthesses(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the n : ");
        int n = sc.nextInt();
        printParenthesses(0,0,n,"");
    }
}
