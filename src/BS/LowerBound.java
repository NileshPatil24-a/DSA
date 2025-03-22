package BS;

public class LowerBound {
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5,6};
        int x=3;
        int n=a.length;
        int lb=n;
        int low=0,high=n-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(a[mid]>=x){
                lb=Math.min(lb,mid);
                high=(mid-1);
            }else {
                low=(mid+1);
            }
        }
        System.out.println(lb);
    }
}
