package WrapperClass;

public class Boxing {
    public static void main(String[] args) {
        //PDT into Object type
        int a=10;
        Integer obj=Integer.valueOf(a);
        System.out.println(a);
        System.out.println(obj);

        //boolean into object type
        boolean flag=true;
        Boolean obj1=Boolean.valueOf(flag);
        System.out.println(flag);
        System.out.println(obj1);
    }
}
