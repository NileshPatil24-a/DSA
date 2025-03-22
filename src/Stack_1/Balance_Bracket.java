package Stack_1;
import java.util.Stack;
public class Balance_Bracket {
    public static boolean balance(String s){
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(')');
            } else if (c=='{') {
                st.push('}');
            }else if(c=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(balance(s));
    }
}
 