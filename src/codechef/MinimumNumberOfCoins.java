package codechef;

import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the test case : ");
        int t = sc.nextInt();
        while (t>0){
            System.out.println("enter the X : ");
            int X = sc.nextInt();
            int tencoin = X/10;
            int remain = X%10;
            if(remain==5 || remain == 0){
                System.out.println(tencoin+(remain/5));
            }
            else {
                System.out.println(-1);
            }
                    }
    }
}
