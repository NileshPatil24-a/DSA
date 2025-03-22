package Array_1;

import java.util.Scanner;
public class SumCountpairswithgivensum {
    public static void main(String[] args) {
        int a[] =  {1, 5, 7, -1, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the targe : ");
        int target = sc.nextInt();
        int n = a.length;
        int count=0;
        for(int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if((a[i]+a[j])==target) count++;
            }
            
        }
        System.out.println(count);
    }
}
