package Hashing;

import java.util.HashMap;

public class IterationOnMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("nilesh",23);
        map.put("ram",234);
        map.put("sham",45);
        map.put("karan",37);
        map.put("magesh",67);
        for(String str : map.keySet()){
            System.out.println(map.get(str));
        }
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for(Object ob : map.entrySet()){
            System.out.println(ob);
        }
    }
}
