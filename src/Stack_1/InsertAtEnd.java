package Stack_1;

import java.util.Stack;

public class InsertAtEnd {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        Stack<Integer> helper = new Stack<>();
        System.out.println(st);
        while(st.size()>0){
            helper.push(st.peek());
            st.pop();
        }
        st.push(-10);
        while(!helper.isEmpty()){
            st.push(helper.peek());
            helper.pop();
        }
        System.out.println(st);
    }
}
