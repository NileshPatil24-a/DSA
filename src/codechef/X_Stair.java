package codechef;

import java.util.Scanner;

public class X_Stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the text case  : ");
        int t = sc.nextInt();
        while(t>0){
            System.out.println("enter the x : ");
            int x = sc.nextInt();
            System.out.println("enter the y : ");
            int y = sc.nextInt();
            int minstep = x/y;
            int reminstep = x%y;
            int total = minstep+reminstep;
            System.out.println("require minium jump to reach : "+ total);
        }

    }
}
