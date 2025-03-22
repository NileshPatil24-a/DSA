package Dynamic_Programming;

public class FibboTabulation {
    public static void main(String[] args) {
        int n =6;
        int a[] = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i=2; i<a.length; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
        System.out.println(a[n]);
    }
}
