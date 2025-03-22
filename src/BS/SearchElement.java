package BS;

public class SearchElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int n=a.length;
        int low=0,high=n-1;
        int target=45;
        boolean flac=false;
        while (low<=high){
            int mid=(low+high)/2;
            if(a[mid]>target){
                high=(mid-1);
            }
            else if(a[mid]<target){
                low=(mid+1);
            } else if (a[mid]==target) {
                System.out.println("got target "+target);
                flac=true;
                break;
            }
        }
        if(flac==false){
            System.out.println("not found");
        }
    }
}
