package Array;
import java.util.Scanner;
public class KthSmallestElementinUnsortedArray {
    public static void swap(int a[], int i, int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void Sort(int a[]){
        int n = a.length;
        for(int i =0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]){
                    swap(a,j, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int a [] = {7, 10, 4, 3, 20, 15};
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the Kth Number  : ");
        int k = sc.nextInt();
        Sort(a);
        System.out.println(a[k-1]);
    }
}
