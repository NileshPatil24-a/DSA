package Stack_1;

import java.util.Stack;

public class PrintStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st);
        int a [] = new int[st.size()];
        for(int i = st.size()-1; i>=0; i--){
            a[i] = st.peek();
            st.pop();
        }
        for(int ele : a){
            System.out.print(ele +" ");
        }
    }
}
