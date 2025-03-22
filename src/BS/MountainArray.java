package BS;

public class MountainArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,20};
      int n=a.length;
      int low=1;
      int high=n-2;
      while (low<=high){
          int mid= low+(high-low)/2;
          if(a[mid]>a[mid-1] && a[mid]>a[mid+1]){
              System.out.println(mid);
              break;
          }else if(a[mid]>a[mid-1] && a[mid]<a[mid+1]){
              low=mid+1;
          }else if(a[mid]<a[mid-1] && a[mid]>a[mid+1]){
              high=mid-1;
          }
      }
    }
}
