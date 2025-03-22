package Stack_1;

import java.util.Stack;

public class Infix_Expression {
    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        Stack <Integer> st = new Stack<>();
        Stack <Character> ch = new Stack<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            int asci = (int)c;
            if(asci>=48 && asci<=57){
                st.push(asci-48);
            }

        }
    }
}
