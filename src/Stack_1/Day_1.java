package Stack_1;
import java.util.Stack;
public class Day_1 {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

    }
}
