package Coding_competion_question;

import java.util.*;

public class nextgrestaEmement {
    public static void main(String[] args) {
        int a [] = {7,8,1,2,10};
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        for(int i =0; i<n; i++){
            if(st.isEmpty()){
                st.push(a[i]);
            }
            else{
                if(a[i]>st.peek( )){
                    ans.push(a[i]);
                }else{
                    st.push(a[i]);
                }
            }
        }
        System.out.println(ans);
        System.out.println(ans.size());
    }
}
