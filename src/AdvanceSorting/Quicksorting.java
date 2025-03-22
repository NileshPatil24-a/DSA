package AdvanceSorting;

public class Quicksorting {
    public  static void swap(int a[], int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int  partition(int a[], int lo, int hi){
        int pivot = a[lo];
        int smallcount=0;
        for(int i=lo+1; i<=hi; i++){
            if(a[i]<=pivot) smallcount++;
        }
        int correctcount = smallcount+lo;
        //swap the a[lo] and a[correctind]
        swap(a,correctcount,lo);
        //partition
        int i=lo,j=hi;
        while (i<correctcount && j>correctcount){
            if(a[i]<=pivot) i++;
            else if (a[j]>pivot) j--;
            else if(a[i]>pivot && a[j]<pivot){
                swap(a,i,j);
            }
        }
        return correctcount;
    }
    public static void quicksort(int a[], int lo, int hi){
        if(lo>=hi) return;
        // pivot a[lo] ko sahi jag rako
        // & left part me <=pivot
        int indx= partition(a,lo,hi);
        quicksort(a,lo, indx-1);
        quicksort(a,indx+1, hi);

    }
    public static void main(String[] args) {
        int a[]={4,9,7,1,3,2,6,5,-8};
        int n=a.length;
        quicksort(a,0,n-1);
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
