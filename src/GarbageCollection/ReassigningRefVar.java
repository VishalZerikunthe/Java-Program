package GarbageCollection;
import java.util.*;
import java.lang.*;
public class ReassigningRefVar {
    public static void main(String[] args) {
        ReassigningRefVar obj1=new ReassigningRefVar();
        ReassigningRefVar obj2=new ReassigningRefVar();

        obj1=new ReassigningRefVar();
        obj2=obj1;
        //both objects eligible for gc
        System.gc();
    }
}
