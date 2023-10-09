package MethodOverriding;

class X
{
    void method(int a)
    {
        System.out.println("ONE");
    }

    void method(double d)
    {
        System.out.println("TWO");
    }
}

class Y extends X
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        new Y().method(100);
    }
}


class A
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class B extends A
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Cc extends B
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Z");
    }
}

public class Overriding2
{
    public static void main(String[] args)
    {
        A a = new B();

        a.calculate(10, 20);

        B b = (B) a;

        b.calculate(50, 100);

        Cc c = (Cc) b;

        c.calculate(100, 200);
    }
}

