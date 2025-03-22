package Stack_1;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterWithoutstack {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 4};
        long x[] = new long[a.length];
        int n = a.length;
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= a[i]) {
                st.pop();
            }
            x[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }

        System.out.println(Arrays.toString(x));
    }
}
