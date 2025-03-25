package Coding_competion_question;

import java.util.Scanner;

public class Kadans {
    public static void main(String[] args) {
        int n = 9;

        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            sum += a[i];
            max= Math.max(max,sum);
            if(sum<0) sum =0;
        }
        System.out.println(max);
    }
}
