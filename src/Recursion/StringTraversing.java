package Recursion;

public class StringTraversing {
    public static void print(int i, String str,String ans){
        if(i==str.length()) {
            System.out.print(ans);
            return;
        }
        if(str.charAt(i)!= 'a'){
            ans+=str.charAt(i);
        }
        print(i+1,str,ans);
    }
    public static void main(String[] args) {
        String sc = "patil mahesh";
        print(0,sc,"");
    }
}
