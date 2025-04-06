package Stack_1;

import java.util.Stack;

public class removedubcate {
    public static void main(String[] args) {
        int a [] = {1,2,2,3,10,10,10,4,4,4,5,7,7,7,1};
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
           if(st.size()==0 || st.peek()!=a[i]){
               st.push(a[i]);
           }else if(st.peek()==a[i]){
               if(i==n-1 || a[i]!=a[i+1]) st.pop();
           }
        }
        System.out.println(st);
    }
}
