package PatternProg;

public class RightAngledTriangle {
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
public static void main(String[] args) {
    for (int rows = 1; rows <=5 ; rows++) {
        for (int col = 1; col <=rows ; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
