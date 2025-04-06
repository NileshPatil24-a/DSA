package QueuesDataStructure;

public class ArrayImplentation {
    public static class que{
        static int a [] = new int[5];
        static int f = -1;
        static int r = -1;
        static int size =0;
        public void add(int x){
            if(r==a.length)return;
            if(r==-1 && f==-1){
                r=f=0;
                a[r] = x;
            }else{
                a[++r] = x;
            }
        }
        public int remove(){
            if(r==-1 && f==-1){
                System.out.println("undeeflow");
                return -1;
            }else{
                return a[++f];
            }
        }
    }
    public static void main(String[] args) {
        que qu = new que();
        qu.add(1);
    }
}
