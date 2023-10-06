package MultidimensionalArrays;
import java.util.Scanner;
public class SumOfTwoMatrices2 {


    static Scanner sc=new Scanner(System.in);
    //int rows= sc.nextInt();


    static void matrixRead(int[][]mat){
        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat.length ; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("enter rows");
        int rows=sc.nextInt();

        System.out.println("enter cols");

        int cols=sc.nextInt();

        int[][]a=new int[rows][cols];
        int[][]b=new int[rows][cols];

        System.out.println("enter matrix 1");
        matrixRead(a);

        System.out.println("enter matrix 2");
        matrixRead(b);

        int [][]c=new int[rows][cols];

        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j <c.length ; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
