package StringProg;
import MultidimensionalArrays.ScannerInput;

import java.util.Arrays;
import java.util.Scanner;
public class SplitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(sc.nextLine());
//        System.out.println(str.split(2,3));
        String res= Arrays.toString(str.split(String.valueOf(5)));
        System.out.println(res);
    }
}
