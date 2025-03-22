package BasicSorting;

public class BubbleSortedLevel3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,-1};
        int n=a.length;
        for(int k=0; k<n-1; k++){
            boolean flac=true;
            for (int i=0; i<n-1-k; i++){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    flac=false;
                }
            }if(flac==true) break;
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
