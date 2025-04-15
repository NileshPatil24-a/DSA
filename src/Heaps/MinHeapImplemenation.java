package Heaps;

class MinHeap{
    private int arr [];
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    void  add(int num){
        arr[size++] = num;
        unHeapyphy(size-1);
    }
    void unHeapyphy(int indx){
        if(indx==0) return;
        int parent = (indx-1)/2;
        if(arr[indx]<arr[parent]){
            swap(indx,parent);
            unHeapyphy(parent);
        }
    }
    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int size(){
        return size;
    }
    int peek(){
        if(size<0) return -1;
        return arr[0];
    }
    int remove(){
        if(size==0) return -1;
        int num = arr[0];
        swap(0,size-1);
        return num;
    }
}
public class MinHeapImplemenation {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(2);
        System.out.println(pq.peek());
    }
}
