package Strings;

import java.util.Scanner;

public class RomanToIntiger {
    public static int getvalue(char ch ){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the String");
        String s =  sc.nextLine();
        int n = s.length();
        int sum =0;
        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            if((i+1)<n && getvalue(ch) < getvalue(s.charAt(i+1))){
                sum-=getvalue(ch);
            }else {
                sum+=getvalue(ch);
            }
        }
        System.out.println(sum);
    }
}
