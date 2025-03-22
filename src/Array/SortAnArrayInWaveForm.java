package Array;

public class SortAnArrayInWaveForm {
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
    public static void Sort(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1])swap(a,j,j+1);
            }
        }
    }
    public static void wavesort(int a[]){
        Sort(a);
        int n = a.length;
        for(int i=0; i<n-1; i = i+2){
            swap(a,i,i+1);
        }
    }
    public static void main(String[] args) {
        int a [] = {10, 5, 6, 3, 2, 20, 100, 80};
        wavesort(a);
        for(int ele  : a){
            System.out.print(ele + " ");
        }
    }
}
