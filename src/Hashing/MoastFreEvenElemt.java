package Hashing;
import java.util.HashMap;
public class MoastFreEvenElemt {
    public static void main(String[] args) {
        int a []  = {1,2,3,4,2,2,4,6,6};
        int n = a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(a[i])){
                int freq = map.get(a[i]);
                map.put(a[i],freq+1);
            }
            else{
                if(a[i]%2==0) map.put(a[i],1);
            }
        }
        System.out.println(map);
    }
}
