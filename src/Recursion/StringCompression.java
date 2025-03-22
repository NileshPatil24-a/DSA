package Recursion;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaaabbcddeff";
        char ch []= str.toCharArray();
        String ans = "";
        int j=0,i=0;
        while (j<str.length()){
            if(ch[i]==ch[j]) j++;
            else {
                ans+=ch[i];
                int len = j-i;
                if(len>1){
                    ans+=len;
                }
                i=j;
            }
        }
        ans+=ch[i];
        int len = j-i;
        if(len>1){
            ans+=len;
        }
        System.out.println(ans);
    }
}
