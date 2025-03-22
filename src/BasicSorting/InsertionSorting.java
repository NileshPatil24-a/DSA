package BasicSorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int a[]={1,2,3,0,-4,1,2,56};
        int n=a.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>=1; j--){
                if(a[j]<a[j-1]){
                    int temp =a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }else {
                    break;
                }
            }
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
