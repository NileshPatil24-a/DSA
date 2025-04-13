import java.util.HashMap;

public class Maxtimeappeear {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "nileshbilapatillll";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.isEmpty() && map.containsKey(ch)) {
                int id = map.get(ch);
                map.put(ch, id + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int  ele : map.values()){
            max= Math.max(ele,max);
        }
        System.out.println(max);
        System.out.println(map.get(max));
    }
    }
