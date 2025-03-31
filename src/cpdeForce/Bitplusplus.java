package cpdeForce;

import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for(int i=0; i<n; i++){
            String sta = sc.next();
            if(sta.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
