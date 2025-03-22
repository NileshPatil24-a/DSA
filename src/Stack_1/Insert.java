package Stack_1;
import java.util.Stack;
public class Insert {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);
        Stack <Integer> temp = new Stack<>();
        int index = 3;
        while(st.size() >=3){
            temp.push(st.pop());
        }
        System.out.println(temp);
        st.push(70);
        System.out.println(st);
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
