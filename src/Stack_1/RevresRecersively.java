package Stack_1;

import java.util.Stack;

public class RevresRecersively {
    public static void revres(Stack <Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        revres(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        revres(st);
//        Stack <Integer> a = new Stack<>();
//        a.pop();
//        System.out.println(a.peek());
    }
}
