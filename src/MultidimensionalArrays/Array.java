package MultidimensionalArrays;

public class Array {
    public static void main(String[] args) {
        int [][]A=new int[3][4];
        System.out.println(A[0][2]);
        int [][]B={
                {1,2,3,4},
                {4,5,6,7},
                {7,8,9,10}
        };
        for (int i = 0; i <B.length ; i++) {
            for (int j = 0; j <B[i].length ; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
