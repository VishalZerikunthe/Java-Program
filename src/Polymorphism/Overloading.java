package Polymorphism;

public class Overloading {
    void m1(){
        System.out.println("m1");
    }
    void m1(int a){
        System.out.println("m1 int");
    }
    void m1(String a){
        System.out.println("m1 string");
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.m1();
        obj.m1(1);
        obj.m1("hi");
    }
}

class OverLoadingScenarios2
{
    void m1(int a) {
        System.out.println(" I am in m1-A");
    }
    void m1(String s) {
        System.out.println("I am in m1-B");
    }
    void m1(Object o) {
        System.out.println("I am in m1-C");
    }
    public static void main(String[] args)
    {
        OverLoadingScenarios2 obj = new OverLoadingScenarios2();
        obj.m1(null);
    }
}

class XYZ
{
    void msg(Object obj) {
        System.out.println("Good");
    }
    void msg(String str) {
        System.out.println("Better");
    }
    void msg(Integer itr) {
        System.out.println("Best");
    }
    public static void main(String[] args)
    {
        XYZ obj = new XYZ();
        obj.msg(new Object());
        obj.msg("Scientech Easy");
        obj.msg(new XYZ());

        obj.msg(new String());
        obj.msg(10);
        obj.msg(new Integer(0));
    }
}

class WXYZ
{
    void msg(Object obj) {
        System.out.println("Good");
    }
    void msg(String str) {
        System.out.println("Better");
    }
    void msg(Integer itr) {
        System.out.println("Best");
    }
    public static void main(String[] args)
    {
        WXYZ obj = new WXYZ();
       // obj.msg(null); // Created an ambiguous situation for the compiler to call
    }
}

class Overloaded
{
    public static void msg(long a, int b) {
        System.out.println("Hello");
    }
    public static void msg(int a, long b) {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        msg(5l, 10);
      //  msg(10,11);
    }
}

class Overloaded2
{
    public static void test(int[] intArr) {
        System.out.println("int array");
    }
    public static void test(char[] charArr) {
        System.out.println("char array");
    }
    public static void main(String[] args)
    {
        //test(null);
    }
}

class Overloaded3
{
    public void test(int i) {
        System.out.println("int");
    }
    public void test(Number n) {
        System.out.println("Number");
    }
    public void test(Integer i) {
        System.out.println("Integer");
    }
    public static void main(String[] args)
    {
        Overloaded3 o = new Overloaded3();
        o.test(null);
        o.test(10); // Exact matched.
    }
}

class Overloaded4 {
    public void test(int i) {
        System.out.println("Int");
    }

    public void test(int... i) {
        System.out.println("Int");
    }

    public void test(char... c) {
        System.out.println("Char varargs");
    }

    public static void main(String[] args) {
        Overloaded4 obj = new Overloaded4();
        obj.test('a');
        obj.test(10); // Exact matched.
    }
}
//Methods with varargs (…) have the lowest priority. That’s why the output is Int.

class A
{

}

class B extends A
{

}

class C extends B
{

}

class MainClass
{
    static void overloadedMethod(A a)
    {
        System.out.println("ONE");
    }

    static void overloadedMethod(B b)
    {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }

    public static void main(String[] args)
    {
        C c = new C();

        overloadedMethod(c);
    }
}