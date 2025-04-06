package QueuesDataStructure;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        System.out.println(que);
        Stack<Integer> st = new Stack<>();
        while(que.size()>0){
            st.push(que.peek());
            que.remove();
        }
        System.out.println(st);
        while(!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println(que);

    }
}
