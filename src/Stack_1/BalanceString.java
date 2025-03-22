package Stack_1;
import java.util.Stack;

public class BalanceString {
    public static String bala(String s){
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(bala(s));
    }
}
