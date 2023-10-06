package GarbageCollection;

public class GCcallsFinalizeOnlyOnce {
    static GCcallsFinalizeOnlyOnce obj;

    public static void main(String[] args) throws InterruptedException {
        GCcallsFinalizeOnlyOnce obj2=new GCcallsFinalizeOnlyOnce();
        System.out.println(obj2.hashCode());
        obj2=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(obj.hashCode());
        obj=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("Endof main()");
    }
    public void finalize(){
        System.out.println("finalize called");
        obj=this;
    }
    //even though objects eligible for GC two times, but GC calls finalize() only once
}
