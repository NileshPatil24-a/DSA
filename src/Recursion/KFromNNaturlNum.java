package Recursion;

public class KFromNNaturlNum {
    public static void printsub(int i, int n, int k, String ans){
        if(i==n){
            System.out.println(ans);
            return;
        }
    }
    public static void main(String[] args) {
        int k =4;
        int n = 6;

        printsub(1,n,k,"");
    }
}
