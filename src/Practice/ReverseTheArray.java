package Practice;

public class ReverseTheArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int n  = a.length;
        int i=0;
        int j=n-1;
        while (i<=j){
            int temp = a[i];
            a[i]= a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
