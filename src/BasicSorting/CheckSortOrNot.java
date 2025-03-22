package BasicSorting;

public class CheckSortOrNot {
    public static void main(String[] args) {
        int a[]={1,-3,3,4};
        int n=a.length;
        boolean flac=true;
        for(int i=0; i<n-1; i++){
            if(a[i]>=a[i+1]){
                flac=false;
            }
        }
        if(flac==true){
            System.out.println("sorted");
        }else {
            System.out.println("not sorted");
        }
    }
}
