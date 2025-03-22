package Hashing;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
        System.out.println(set.contains(23));
        System.out.println(set.remove(20));
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
