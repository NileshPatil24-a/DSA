public class printnto1 {
    public static void print(int n,int i){
        if (n == 0) {
            return;
        }
        System.out.print(i);
        print(n-1,i+1);
    }
    public static void main(String[] args) {
        int n = 4;
        print(n,1);
    }
}
