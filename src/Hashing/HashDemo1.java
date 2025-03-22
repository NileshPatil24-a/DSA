package Hashing;
import java.util.HashMap;
public class HashDemo1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("nilesh",23);
        map.put("ram",234);
        map.put("sham",45);
        System.out.println(map);
        System.out.println(map.remove("nilesh"));
        System.out.println(map.get("ram"));
        System.out.println(map.containsKey("ram"));


    }
}
