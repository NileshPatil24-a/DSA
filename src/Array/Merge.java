package Array;

public class Merge {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int b [] = {3,4,5,6};
        int c [] = new int[a.length+b.length];
        int i=0;
        int k =0;
        int j =0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                c[k] = b[j];
                k++;
                j++;
            }
            else {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        if(i==a.length){
            while (j<a.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<b.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele : c){
            System.out.print(ele +" ");
        }
    }
}
