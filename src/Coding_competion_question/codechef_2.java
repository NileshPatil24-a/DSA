package Coding_competion_question;

import java.util.Scanner;

public class codechef_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr the t : ");
        int t = sc.nextInt();
        int count = 0;
        while(t -- >0){
            System.out.println("enet ht e n : ");
            int n = sc.nextInt();
            int a [] = new int[n];
            for(int i=0; i<n; i++){
                System.out.println("enter the "+i+1);
                a[i] = sc.nextInt();
            }
            for(int i=n-1; i>0; i--){
                if(a[i-1] > a[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
