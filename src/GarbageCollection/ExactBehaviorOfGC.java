package GarbageCollection;

public class ExactBehaviorOfGC {
    static int count=0;

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            ExactBehaviorOfGC obj=new ExactBehaviorOfGC();
            obj=null;
        }
    }
}
//we don't expect exact behavior of GC it vary froJVM to JVM