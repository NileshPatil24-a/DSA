package AdvanceSorting;

public class CyclicSortingMissingNum {
    public static int  cyclic(int a[]){
        boolean b[] = new boolean[a.length+1];
        for(int ele : a){
            b[ele]=true;
        }
        for(int i=0; i<=a.length; i++){
            if(b[i]== false) return i;
        }
        return 33;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7};
        cyclic(a);
    }
}
