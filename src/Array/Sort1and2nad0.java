package Array;

public class Sort1and2nad0 {
    public static void main(String[] args) {
        int a [] = {1,1,2,2,0,0,0,1,2,0,1,0,2};
        int n = a.length;
        int numOf0 = 0;
        int numOf1 = 0;
        for(int i=0; i<n; i++){
            if(a[i]==0) numOf0++;
            if(a[i]==1) numOf1++;
        }
        for(int i=0; i<n; i++){
            if(i<numOf0) a[i]=0;
            else if(i<numOf0+numOf1) a[i]=1;
            else a[i]=2;
        }
        for(int ele : a){
            System.out.print(ele +" ");
        }
    }
}
