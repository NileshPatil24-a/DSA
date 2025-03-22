package Array;

public class ShiftNegativeNumberLogic_2 {
    public static void main(String[] args) {
        int a [] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n  = a.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            if(a[start]<0) start++;
            else if(a[end]>0) end--;
            else{
                int temp = a[start];
                a[start] = a[end];
                a[end]= temp;
                start++;
                end--;
            }
        }
        for(int ele : a){
            System.out.print(ele +" ");
        }
    }
}
