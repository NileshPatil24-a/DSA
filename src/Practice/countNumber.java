package Practice;

public class countNumber {
    public static void main(String[] args) {
        int a [] = {1,1,1,2,2,3,1,1,2,3};
        int currcount=0;
        int prevcount = 0;
        for(int i=0; i<a.length-1; i++){
            for(int j=i; j<a.length; j++){
                if(a[j]!=a[j+1]){
                    currcount ++;
                }
            }
            prevcount = Math.max(currcount,prevcount);
        }
        System.out.println(prevcount);
    }
}
