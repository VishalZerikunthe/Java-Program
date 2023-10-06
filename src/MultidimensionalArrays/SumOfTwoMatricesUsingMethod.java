package MultidimensionalArrays;
import java.util.Scanner;
public class SumOfTwoMatricesUsingMethod {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter rows");
        int rows=sc.nextInt();

        System.out.println("enter cols");
        int cols= sc.nextInt();
        int[][]a=new int[rows][cols];
        int[][]b=new int[rows][cols];
        System.out.println("enter matrix1");
        matrixRead(a);
        System.out.println("enter matrix2");
        matrixRead(b);
        int [][]c=new int[rows][cols];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");
            }
        }
    }
    static void matrixRead(int[][]matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                matrix[i][j]=sc.nextInt();
              //  System.out.println(matrix[i][j]);
            }

        }
    }
}
