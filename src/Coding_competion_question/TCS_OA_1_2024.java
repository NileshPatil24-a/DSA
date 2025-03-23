package Coding_competion_question;

public class TCS_OA_1_2024 {
    public static void main(String[] args) {
        int a [] = {0, 1, 2, 3, 4, 5, 6};
        int k =9;
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if((a[i]+a[j])==k) count++;
            }
        }
        System.out.println(count);
    }
}
