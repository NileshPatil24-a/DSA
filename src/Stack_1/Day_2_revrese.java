package Stack_1;

import java.util.Scanner;
import java.util.Stack;

public class Day_2_revrese {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack temp = new Stack();
        while (st.size()>0){
            temp.push(st.pop());
        }
        System.out.println(temp);
    }
}
