package AdvanceSorting;

public class MissingElement2 {
    public static void swap(int a[], int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int  cyclic(int a[]){
        int n= a.length;
        int i=0;
        while(i<n){
            if(a[i]==i || a[i]==n){
                i++;
            }else {
                swap(a,a[i],i);
            }
        }
        for(int j=0; j<n; j++){
            if(a[i]!=j) return j;
        }
        return i;
    }
    public static void main(String[] args) {
        int a[]= {9,6,4,2,3,5,7,0,1};
        int b= cyclic(a);
        System.out.println(b);

    }
}
