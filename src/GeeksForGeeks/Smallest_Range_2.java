package GeeksForGeeks;

public class Smallest_Range_2 {
    public static void main(String[] args) {
        int nums [] = {1,3,6};
        int k=3;
        int a[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=k) a[i] = k+nums[i];
            else a[i] = nums[i]-k;
        }
        for(int ele : a){
            System.out.println(ele);

        }
    }
}
