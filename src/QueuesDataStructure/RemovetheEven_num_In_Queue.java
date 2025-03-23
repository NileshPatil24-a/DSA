package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;
public class RemovetheEven_num_In_Queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        Queue<Integer> helper = new LinkedList<>();
        while(!que.isEmpty()){
            if(!que.isEmpty()){
                helper.add(que.remove());
            }
            que.remove();
        }
        System.out.println(helper);
    }
}
