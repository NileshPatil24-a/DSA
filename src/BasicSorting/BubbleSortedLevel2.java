package BasicSorting;

public class BubbleSortedLevel2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,-1,2,0};
        int n=a.length;
        for(int x=0; x<n-1; x++){
            for(int i=0; i<n-1; i++){
                if(a[i]>a[i+1]){
                    int temp =a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
