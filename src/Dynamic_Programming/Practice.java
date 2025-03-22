package Dynamic_Programming;

public class Practice {
    public static int fibob(int n, int a[]){
        if(n<=1) return n;
        int ans;
        if(a[n]!=0) return a[n];
        ans = fibob(n-1,a) + fibob(n-2,a);
        return ans;
    }
    public static void main(String[] args) {
        int n =6;
        int a [] = new int[n+1];
        System.out.println(fibob(n,a));
    }
}
