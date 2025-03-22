package Array;

import java.util.Scanner;

public class NuberOfOcuurenceElemne {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enetr the target element : ");
        int target = sc.nextInt();
        int a [] = {1,1,1,11,22,2,22,22,2,2,2,2,33,3,3,3,3,3,3,3,3,3,3,3,3};
        int n = a.length;
        int freq= 0;
        for(int i=0; i<n; i++){
            if(a[i]==target){
                freq++;
            }
        }
        System.out.println(freq);
    }
}
