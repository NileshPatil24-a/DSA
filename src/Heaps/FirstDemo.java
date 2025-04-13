package Heaps;

import java.util.PriorityQueue;

public class FirstDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        int k = 3;
        ans.add(10);
        ans.add(2);
        ans.add(3);
        ans.add(8);
        ans.add(-4);
        ans.add(-2);
        ans.add(6);
        int str = 0;
        for(int i=0; i<k; i++){
            str = ans.peek();
            ans.remove();
        }
        System.out.println(str);
    }
}
