package MethodOverriding;

class Parent{
    void property(){

        System.out.println("cash,gold,land");
    }
    void marry(){

        System.out.println("arrange marriage");
    }
}
class C extends Parent{
    @Override
    void marry() {

        System.out.println("love marriage");
    }
}
public class ParentChildProperty {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.marry();
        C c=new C();
        c.marry();
        Parent p1=new C();
        p1.marry();
    }
}
