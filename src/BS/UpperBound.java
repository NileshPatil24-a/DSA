package BS;

public class UpperBound {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        int lb=n;
        int x=3;
        int low=0,high=n;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]>x){
                lb=Math.min(lb,mid);
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        System.out.println(lb);
    }
}
