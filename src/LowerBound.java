public class LowerBound {
    public static void main(String[] args) {
        int a [] = {1,2,3,7,8,9,20,50,60};
        int n = a.length;
        int low = 0;
        int high = n-1;
        int target = 6;
        int lb = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(a[mid]<=target){
                lb = Math.max(lb,mid);
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        System.out.println(a[lb]);
    }
}
