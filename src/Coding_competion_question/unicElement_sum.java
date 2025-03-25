package Coding_competion_question;
import java.util.HashMap;
public class unicElement_sum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a [] = {1,5,3,4,1,3,2};
        for(int i=0; i<a.length; i++){
            if(map.containsKey(a[i])){
                int fre = map.get(a[i]);
                map.put(a[i],fre+1);
            }else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);
        int sum = 0;
        for(int ele : map.keySet()){
            int val = map.get(ele);
            if(val==1){
                sum += ele;
            }
        }
        System.out.println(sum);
    }
}
