package Heaps;

import java.util.PriorityQueue;

public class KthSort {
    public static void main(String[] args) {
        int a [] = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        int j = 0;
        for(int i =0; i<a.length; i++){
            pq.add(a[i]);
            if(pq.size()>k){
                a[j] = pq.remove();
                j++;
            }
        }
        while(pq.size()>0){
            a[j] = pq.remove();
            j++;
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
