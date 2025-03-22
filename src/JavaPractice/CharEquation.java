package JavaPractice;
import java.util.Scanner;
public class CharEquation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("welcome");
        System.out.print("enetr the size of matrix only 2 or 3  : ");
        int n =sc.nextInt();
        if(n!=2 && n!=3){
            System.out.println("do not find this please enter 2 or 3 size only");
        }else {
        int a[][] = new int[n][n];
        for(int i=0; i<a.length; i++){
           for(int j=0; j<a.length; j++){
               System.out.print("enter the "+(i+1)+""+(j+1)+": ");
              a[i][j] = sc.nextInt();
           }
        }
        System.out.println("Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        if(n==2){
            System.out.println("now we have char.equation ");
            System.out.println("a^2-s1a+|D|=0");
            int s1= a[0][0]+a[1][1];
            System.out.println("s1= "+(s1));
            int d = a[0][0]*a[1][1] - a[1][0]*a[0][1];
            System.out.println("|d|= "+d);
            System.out.println();
            System.out.println(" your char.equation is = a^2"+(-(s1))+"a + ("+d+")="+0);
            System.out.println("your egin values is ");
            int r=  (int)Math.sqrt(-(s1)*(-s1)-4*1*(d));
            int r1= (-(s1*s1)+r)/2;
            int r2 = (-(s1*s1)-r)/2;
            System.out.println("a1 = "+r1);
            System.out.println("a2 = "+r2);


        }
        if(n==3){
            System.out.println("now we have char.equation ");
            System.out.println("a^3-s1a^2-s2a+|D|=0");
            int s1= a[0][0]+a[1][1]+a[2][2];
            System.out.println("s1 = "+s1);
            int d11=a[0][0]*(a[1][1]*a[2][2]-a[2][1]*a[1][2]);
            int d12=a[0][1]*(a[1][0]*a[2][2]-a[2][0]*a[1][2]);
            int d13=a[0][2]*(a[1][0]*a[2][1]-a[2][0]*a[1][1]);
            int D= d11-d12+d13;
            System.out.println("|D|= "+D);
            int d1 = (a[1][1]*a[2][2]-a[2][1]*a[1][2]);
            int d2= a[0][0]*a[2][2]-a[2][0]*a[0][2];
            int d3=a[0][0]*a[1][1]-a[1][0]*a[0][1];
            int s2 =d1+d2+d3;
            System.out.println("s2= "+s2);
            System.out.println();
            System.out.println("your char.equation is : a^3 "+(-(s1))+"a^2 +"+(s2)+"a +"+(-(D))+"= "+0);
        }
        }

    }
}
