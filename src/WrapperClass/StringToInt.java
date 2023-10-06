package WrapperClass;

public class StringToInt {
    public static void main(String[] args) {
        String str="123";
        int a=Integer.parseInt(str);
        System.out.println(str);
        System.out.println(a);
    }
}

class IntToString{
    public static void main(String[] args) {
        int a=567;
        String str=String.valueOf(a);
        System.out.println(a);
        System.out.println(str);
    }
}
