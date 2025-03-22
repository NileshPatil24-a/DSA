package AdvanceSorting;

public class Dublicatenum {
    public static int dublicate(int a[]){
        int n =  a.length;
        int num=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n-1; j++){
                if(a[j]==a[j+1]){
                    num=a[j];
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int a[]={3,1,3,4,2};
        int num = dublicate(a);
        System.out.println(num);
    }
}
