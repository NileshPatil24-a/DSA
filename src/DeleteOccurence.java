public class DeleteOccurence {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,4,4,4,5,63,3};
        int n = a.length;
        int x = 4;
        int j =0;
        for(int i =0; i<n; i++){
            if(a[i]!=x){
                a[j] = a[i];
                j++;
            }
        }
        for(int ele : a){
            System.out.print(ele +" ");
        }
    }
}
