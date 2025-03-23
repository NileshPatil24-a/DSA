package QueuesDataStructure;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class RverseQue {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        while(!que.isEmpty()){
            st.push(que.remove());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println(que);
    }
}
