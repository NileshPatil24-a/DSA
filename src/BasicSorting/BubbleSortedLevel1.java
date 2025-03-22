package BasicSorting;

public class BubbleSortedLevel1 {
    public static void Print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={6,2,3,4,5};
        int n=a.length;
        Print(a);
        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        Print(a);

    }
}
