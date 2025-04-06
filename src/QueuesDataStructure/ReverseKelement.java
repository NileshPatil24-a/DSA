package QueuesDataStructure;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseKelement {
    public static void main(String[] args) {
        int k  =4;
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        System.out.println(que);
        Stack<Integer> st = new Stack<>();
        int n = que.size();
        int i=0;
        while(i<k){
            st.push(que.remove());
            i++;
        }
        System.out.println(que);
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        i = 0;
        while(i<(n-k)){
            que.add(que.remove());
            i++;
        }
        System.out.println(que);
    }
}
