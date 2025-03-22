import java.util.Scanner;

public class Traisee {
    public static void intput(int a[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length;i++){
            for(int j = 0; j<a.length; j++){
                System.out.print((1+i)+""+(j+1)+" :  " );
                a[i][j] = sc.nextByte();
            }
        }
    }
    public static void Display(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j =0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a [][] = new int [2][2];
        int b[][] = new int[2][2];
        intput(a);
        Display(a);
        intput(b);
        Display(b);

    }
}
