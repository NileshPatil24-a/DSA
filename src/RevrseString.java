public class RevrseString {
    public static void main(String[] args) {
        String s  = "sagar";
        int n = s.length();
        for(int i=0; i<n/2; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(n-1-i);
            char  ch = c1;
                  c1 = c2;
                  c2 = ch;
        }
        System.out.println(s);
    }
}
