package Stack_1;

import java.util.Stack;

public class Day_2_Insert_at_Index {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        Stack <Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        System.out.println(temp);
        temp.push(70);
        Stack <Integer> temp2 = new Stack<>();
        while(!temp.isEmpty()){
            temp2.push(temp.pop());
        }
        System.out.println(temp2);
    }
}
