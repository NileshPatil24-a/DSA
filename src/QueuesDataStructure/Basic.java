package QueuesDataStructure;
import java.util.Queue;
import java.util.LinkedList;
public class Basic {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        System.out.println(que);
        System.out.println(que.peek());
    }
}
