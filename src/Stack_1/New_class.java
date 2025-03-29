package Stack_1;

import java.util.Stack;

public class New_class {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.add(20);
        sc.push(45);
        System.out.println(sc);
        while(!sc.isEmpty()){
            System.out.print(sc.pop()+" ");
        }
        System.out.println(sc);
    }
}
