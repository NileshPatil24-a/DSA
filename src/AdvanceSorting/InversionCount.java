// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InversionCount {
    static int count;
    public static void inversion(int a[], int b[]){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count+=(a.length-i);
                j++;
            }else{
                i++;
            }
        }
    }
    public static void merge(int a[], int b[], int c[]){
        int i=0;
        int  j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                c[k]= b[j];
                j++;
                k++;
            }else{
                c[k]=a[i];
                i++;
                k++;
            }
        }
        if(i==a.length){
            if(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
    }
    public static void sort(int c[]){
        int n=c.length;
        if(n==1) return;
        int a[]= new int[n/2];
        int b[]=new int[n-n/2];
        for(int i=0; i<n/2; i++){
            a[i]=c[i];
        }
        for(int i=0; i<n-n/2; i++){
            b[i]=c[i+n/2];
        }
        sort(a);
        sort(b);
        inversion(a,b);
        merge(a,b,c);
    }
    public static void main(String[] args) {
        int c[]={8,2,5,3,1,4};
        sort(c);
        for(int ele: c){
            System.out.print(ele+" ");
        }
        System.out.println("inversion is "+count);
    }
}