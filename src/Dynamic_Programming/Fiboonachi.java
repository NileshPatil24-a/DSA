package Dynamic_Programming;

public class Fiboonachi {
    public static int fibo(int n, int [] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0) return dp[n];
        int ans;
        ans = fibo(n-1,dp) + fibo(n-2,dp);
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];
        System.out.println(fibo(n,dp));
    }
}
