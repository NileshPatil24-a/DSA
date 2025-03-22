public class mergetowarry {
    public static void main(String[] args) {
        int  a [] = {1,2,3,4};
        int b[] = {4,5,6,7};
        int c [] = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<=a.length-1 && j<=b.length-1){
            if(a[i]>b[j]){
                c[k] = b[j];
                k++;
                j++;
            }else{
                c[k] = a[i];
                k++;
                i++;
            }
        }
            while (j<b.length){
                c[k] = b[j];
                k++;
                j++;
            }
            while(i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }


        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
