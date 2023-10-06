package MultidimensionalArrays;
import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int [][]a=new int[rows][cols];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
