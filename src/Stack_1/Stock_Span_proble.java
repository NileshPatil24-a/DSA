package Stack_1;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Span_proble {
    public static void main(String[] args) {
        int a [] = {100,80,60,70,60,75,85};
        int n = a.length;
        int x[] = new int[n];
        x[0] = 1;
        Stack <Integer> st = new Stack<>();
        for(int i=1; i<n; i++){
            int count = 1;
            while (!st.isEmpty() && st.peek() <=a[i]){
                count++;
                st.pop();
            }
            x[i] = st.isEmpty() ? 1 : count;
            st.push(a[i]);
        }
        System.out.println(Arrays.toString(x));
    }
}
