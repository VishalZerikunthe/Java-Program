package MultidimensionalArrays;
import javax.script.ScriptContext;
import java.util.Scanner;
import java.util.SortedMap;
public class SumOfTwoMatrices3 {
 //   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row ,col ;
//        System.out.println("Enter the no of Rows:");
//        row = sc.nextInt();
//        System.out.println("Enter the no of columns");
//        col= sc.nextInt();
//        int[][] a= new int[row][col];
//        int[][] b= new int[row][col];
//        int[][] c= new int[row][col];
//        System.out.println("Enter the First matrix elements:");
//        a=_getAndDisplayMatrix(row,col);
//        System.out.println("Enter the Second matrix elements:");
//        b=_getAndDisplayMatrix(row,col);
//        System.out.println("Get the sum of above two matrix elements:");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                c[i][j]=a[i][j]+b[i][j];
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    static int[][] _getAndDisplayMatrix(int row,int col){
//        int[][] array = new int[row][col];
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.println("Enter the element:a["+i+"]["+j+"]");
//                array[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.println("Entered the element:array["+i+"]["+j+"]"+"---->"+array[i][j]);
//            }
//        }
//        return array;
//    }
       // public class First {
            static Scanner sc=new Scanner(System.in);
            public static void main(String[] args) {
                System.out.println("enter rows");
                int rows=sc.nextInt();

                System.out.println("enter cols");
                int cols= sc.nextInt();
                int[][]a=new int[rows][cols];
                int[][]b=new int[rows][cols];
                System.out.println("enter matrix1");
                matrixRead(a,rows,cols);
                System.out.println("enter matrix2");
                matrixRead(b,rows,cols);
                int [][]c=new int[rows][cols];
                for (int i = 0; i <rows ; i++) {
                    for (int j = 0; j <cols ; j++) {
                        c[i][j]=a[i][j]+b[i][j];
                        System.out.print(c[i][j]+ " ");
                    }
                }
            }
            static void matrixRead(int[][]matrix,int a,int b){
                System.out.println("Matrix length "+matrix.length);
                for (int i = 0; i < a ; i++) {
                    for (int j = 0; j < b ; j++) {
                        matrix[i][j]=sc.nextInt();
                        //  System.out.println(matrix[i][j]);
                    }

                }
            }
}

