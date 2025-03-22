package GeeksForGeeks;

public class Print_The_SubArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,56};
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("("+(a[i])+","+a[j]+")");
            }
            System.out.println();
        }
    }
}
