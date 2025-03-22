package BasicSorting;

public class TransformArray {
    public static void main(String[] args) {
        int a[]={40,12,78,34,100,57,23};
        int n=a.length;
        int x=0;
        for(int j=0; j<n; j++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int i=0; i<n; i++){
                if(a[i]<min && a[i]>0){
                    min=a[i];
                    mindex=i;
                }
            }
            a[mindex]=x;
            x--;
        }
        for(int ele:a){
            System.out.print((-ele)+" ");
        }
    }
}
