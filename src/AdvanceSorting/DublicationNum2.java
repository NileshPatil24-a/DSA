package AdvanceSorting;

public class DublicationNum2 {
    public static void swap(int a[], int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int dublicate(int a[]){
        while(true){
            int ele = a[0];
            if(a[ele]==ele) return ele;
            swap(a,ele,0);
        }
    }
    public static void main(String[] args) {
        int a[]={2,1,4,3,2};
        int d= dublicate(a);
        System.out.println(d);
    }
}
