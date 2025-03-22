package Strings;

import java.util.Scanner;

public class Equate_S_and_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the test case");
//        int n = sc.nextInt();
//        while(n>0){
//            System.out.println("enetr the N : ");
//            int N = sc.nextInt();
//            System.out.println("enter the M : ");
//            int m = sc.nextInt();
//            System.out.println("enetr the S : ");
//            String S = sc.nextLine();
//            System.out.println("enter the T : ");
//            String T = sc.nextLine();
//
//            if(S.equals(T)){
//                System.out.println("Yes");
//            } else if () {
//
//            }
//        }
//
        System.out.println("enter the S : ");
        String S = sc.nextLine();
        System.out.println("enetr the N : ");
        String T = sc.nextLine();
        int N= S.length();
        int M = T.length();
        int min = Math.min(M,N);
        for(int i=0; i<min; i++){
            if(S.charAt(i)=='a'){
//                S.replace(S.charAt(i),"ab");
            } else {
                S.equals(T);
                System.out.println("Yes");
            }
        }
    }
}
