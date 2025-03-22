package GeeksForGeeks;

public class Traceince {
    public static void main(String[] args) {
        int a [][] = {{1,2},{3,4}};
        int b [][] = {{4,5},{6,7}};
        System.out.println("A ");
        for(int i =0; i< a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("B ");
        for(int i =0; i< b.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int  p1 = (a[0][0] + a[0][1])*(b[0][0] + b[0][1]);
        int p2 = (a[1][0] + a[1][1]) * b[0][0];
        int p3 = a[0][0] * (b[0][1] - b[0][1]);
        int p4 = a[1][1] * (b[1][0] - b[0][0]);
        int p5 = (a[0][0] + a[0][1]) * b[1][1];
        int p6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]);
        int p7  = (a[0][1]- a[1][1]) * (b[1][0]+ b[1][1]);

        int c11= p1+p4 - p5 + p7 ;
        int c12 = p3 + p5;
        int c21 = p2 + p4;
        int c22 = p1 + p3 - p2 + p6;

        int c [][] = {{c11,c12},{c21,c22}};

        System.out.println("C matrx ");
        for(int i =0; i< c.length; i++){
            for(int j=0; j<c.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
