public class MaxOfTwo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int n  = a.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
        }
        System.out.println("max number is : "+ max);
        System.out.println("min number is : "+ min);

    }
}
