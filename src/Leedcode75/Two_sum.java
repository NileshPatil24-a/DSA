package Leedcode75;

public class Two_sum {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int target = 5;
        int b [][] = new int [1][1];
        int n = a.length;
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<n; j++){
            }
            if((a[i]+a[j]) == target){
                System.out.println(i+""+j);
                break;
            }
        }
    }
}
