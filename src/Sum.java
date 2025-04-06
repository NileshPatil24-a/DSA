public class Sum {
    public static int numSum(int n,int stor){
        if(n==0) return stor;
        return numSum(n-1,stor+n);

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println( numSum(n,0));
    }
}
