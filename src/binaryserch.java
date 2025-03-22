public class binaryserch {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int n = a.length;
        int low =0;
        int high = n-1;
        int target = 4;
        while(low<=high){
            int mid = (low + high) / 2;
            if(a[mid] == target){
                System.out.println("found");
                break;
            }
            else if(a[mid] > target){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

    }
}
