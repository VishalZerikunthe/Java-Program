package GarbageCollection;
import java.util.*;
import java.lang.*;
public class NullifyingReferenceVar {
    public static void main(String[] args) {
        NullifyingReferenceVar obj1=new NullifyingReferenceVar();
        NullifyingReferenceVar obj2=new NullifyingReferenceVar();

        obj1=null;
        obj2=null;
        //both objects eligible for gc
        System.gc();
    }
}
