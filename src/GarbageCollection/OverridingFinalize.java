package GarbageCollection;

public class OverridingFinalize {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
class Driver extends OverridingFinalize{
    public static void main(String[] args) {
        OverridingFinalize obj=new OverridingFinalize();

    }
}
