import java.util.HashMap;

public class Maxtimeappeear {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "nileshbilapatil";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.isEmpty() && map.containsValue(ch)) {
                int id = map.get(ch);
                map.put(ch, id + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i =0; i<map.size(); i++) {
            int ele = map.get(i);
        }
        System.out.println(map.get(max));
    }
    }
