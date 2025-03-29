package Stack_1;
import java.util.ArrayList;
import java.util.Stack;
public class NextGrestElement {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int a [] = {1, 3, 2, 4};
        int n = a.length;
        for(int ele : a){
            ans.add(-1);
        }
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && a[i]>a[st.peek()]){
                ans.set(st.peek(),a[i]);
                st.pop();
            }
            st.push(i);
        }
        System.out.println(ans);
    }
}
