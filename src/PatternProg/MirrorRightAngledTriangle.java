package PatternProg;

public class MirrorRightAngledTriangle {
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    public static void main(String[] args) {
        for (int rows = 1; rows <=5 ; rows++) {
            for (int cols = 1; cols <=5-rows+1 ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
