package QueuesDataStructure;
import java.util.*;
public class printQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        Queue<Integer> que1= new LinkedList<>();
        while(!que.isEmpty()){
            int ele = que.remove();
            System.out.print(ele + " ");
            que1.add(ele);
        }

    }
}
