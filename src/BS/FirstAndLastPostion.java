package BS;

public class FirstAndLastPostion {
    public static void main(String[] args) {
        int a[]={1,2,3,3,3,3,3,4,5,6};
        int n=a.length;
        int low=0,high=n-1;
        int target=3;
        boolean flac=false;
        while (low<=high){
            int mid= low-(low+high)/2;
            if(a[mid]==target){
                flac=true;
                break;
            } else if (a[mid]>target) {
                low=mid+1;
            } else if (a[mid]<target) {
                high=mid-1;
            }
        }
        if(flac==false){
            System.out.println(-1+""+-1);
        }
        int lb=n;
        while (low<=high){
            int mid= low-(low+high)/2;
            if(a[mid]>=target){
                lb=Math.min(lb,mid);
                high=mid-1;
            }
        }
        int up=n;
        while (low<=high){
            int mid= low-(low+high)/2;
            if(a[mid]>target){
                up=Math.min(up,mid);
                high=mid-1;
            }
        }
        System.out.println(lb+""+up);
    }
}
