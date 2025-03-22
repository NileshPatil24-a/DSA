package BS;

public class SqrtOfX {
    public static void main(String[] args) {
        int x=16;
        int low=0;
        int high=16;
        if(x<=1){
            System.out.println(x);
        }
        while (low<=high){
            int mid= low+(high-low)/2;
            if(mid==x/mid){
                System.out.println(mid);
                break;
            }
            else if((mid)>x/mid){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        System.out.println(high);
    }
}
