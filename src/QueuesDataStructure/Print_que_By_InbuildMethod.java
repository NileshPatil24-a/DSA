package QueuesDataStructure;

import java.util.Queue;
import java.util.LinkedList;
public class Print_que_By_InbuildMethod {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> que1 = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        while(!que.isEmpty()) {
            int ele = que.remove();
            System.out.print(ele + " ");
            que1.add(ele);
        }
    }
}
