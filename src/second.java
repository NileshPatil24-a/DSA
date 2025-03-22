public class second {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int n = a.length;
        int low = 0;
        int high = n-1;
        int target = 90;
        boolean trig = false;
        int stor = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==target){
                trig = true;
                System.out.println(a[mid-1]);
                stor = a[mid-1];
                break;
            } else if (a[mid]>target) {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(trig == false){
            System.out.println("not found");
        }else {
            System.out.println(stor);
        }
    }
}
