package WrapperClass;

public class AutoUnboxing {
    public static void main(String[] args) {
        Integer i=10;
        int a=i;
        System.out.println(i);
        System.out.println(a);

        Integer obj=new Integer(25);
        int b=obj;
        System.out.println(obj);
        System.out.println(b);

    }
}
