package WrapperClass;

public class Unboxing {
    public static void main(String[] args) {
        Integer obj=10;
        int a=obj.intValue();
        System.out.println(obj);
        System.out.println(a);

        Integer obj1=new Integer(20);
        int b=obj1.intValue();
        System.out.println(obj1);
        System.out.println(b);
    }
}
