package MethodOverriding;

class Object{
    public Object method(){
        System.out.println("parent method");
        return null;
    }
}
class Child extends Object{
   public Object method(){
        System.out.println("child method");
        return null;
    }
}
public class ObjectClassString {
    public static void main(String[] args) {
        Object obj=new Object();
        obj.method();
        Child obj1=new Child();
        obj.method();
        Object obj2=new Child();
    }
}
