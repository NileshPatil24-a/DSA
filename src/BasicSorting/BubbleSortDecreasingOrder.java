package BasicSorting;

public class BubbleSortDecreasingOrder {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int n=a.length;
        for(int i=0; i<n-1; i++){
            for (int j = 0; j < n-1; j++) {
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
