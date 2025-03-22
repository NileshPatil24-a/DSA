package Stack_1;

import java.util.Arrays;
import java.util.Stack;

public class PrevesGreater {
    public static void main(String[] args) {
        int a[] = {100, 9, 3, 4, 5};
        int x[] = new int[a.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0   ; i < a.length; i++) {
            while (!st.isEmpty() && st.peek() <= a[i]) {
                st.pop();
            }
            x[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }

        System.out.println(Arrays.toString(x));
    }
}
