import java.util.HashMap;
public class Minimu {
    public static void main(String[] args) {
        int k = 5;
        int arr[] = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ele = arr[i] % k;
            if (map.containsKey(ele)) {
                int indx = map.get(ele);
                map.put(ele, indx + 1);
            } else {
                map.put(ele, i);
            }
        }
        System.out.println(map);
    }
}
