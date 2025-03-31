package Stack_1;

import java.util.Stack;

public class PrintRecursive {
    public static void print(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        print(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        print(st);
        System.out.println(st);
    }
}
