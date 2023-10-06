package GarbageCollection;

public class UncheckedException {
    public static void main(String[] args) {
        UncheckedException obj=new UncheckedException();
        obj=null;
        System.gc();
        System.out.println("End of main()");
    }

    protected void finalize(){
        System.out.println("finalize called");
        System.out.println(10/0);
    }
    //ignores unchecked exception present in finalize block
    //butif programmer do exception then it will catch
}
