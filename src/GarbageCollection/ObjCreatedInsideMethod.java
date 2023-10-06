package GarbageCollection;
import java.util.*;
import java.lang.*;
public class ObjCreatedInsideMethod {
    static void m1(){
        ObjCreatedInsideMethod obj1=new ObjCreatedInsideMethod();
        ObjCreatedInsideMethod obj2=new ObjCreatedInsideMethod();
    }
    public static void main(String[] args) {
        m1();
        //after m1() both objects eligible for gc
        System.gc();
    }
}

class Test{
    static Object m1(){
        Test obj1=new Test();
        Test obj2=new Test();
        return obj1;
    }

    public static void main(String[] args) {
        Object obj3=m1();
        //obj2 is eligible for gc
        System.gc();
    }
}

class Demo{
    public static void main(String[] args) {
        m1();
        System.gc();
    }
    static Object m1(){
        Demo obj1=new Demo();
        Demo obj2=new Demo();
        return obj1;
    }
    //after m1() both objects eligible for gc
}

class Demo1{
    static Object obj1;
    //global can be accessed anywhere
    public static void main(String[] args) {
        m1();
        System.gc();
    }
    static void m1(){
        obj1=new Demo1();
        Demo1 obj2=new Demo1();
        //obj2 is local only access in method
        // so obj2 is eligible for gc
    }
}
