package QueuesDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteOdd {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> newque = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        while(que.size()>0){
            que.remove();
            if(!que.isEmpty()){
                newque.add(que.remove());
            }
        }
        System.out.println(newque);
    }
}
