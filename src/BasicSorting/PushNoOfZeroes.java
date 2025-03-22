package BasicSorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PushNoOfZeroes {
    public static void main(String[] args) {
        int a[]={1, 2, 0, 4, 3, 0, 5, 0};
        int n=a.length;
        for(int j=0; j<n-1; j++){
           for(int i=j; i<n-1; i++){
               if(a[i]==0){
                   int temp =a[i];
                   a[i]=a[i+1];
                   a[i+1]=temp;
               }
           }
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
