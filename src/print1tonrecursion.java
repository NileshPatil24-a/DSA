public class print1tonrecursion {
    public static void print(int str,int end){
        if(end==1) return;
        System.out.println(str);
        print(str+1,end-1);
    }
    public static void main(String[] args) {
        print(1,6);
    }
}
