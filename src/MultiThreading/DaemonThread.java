package MultiThreading;

public class DaemonThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true);
        MyThread t=new MyThread();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}

class My extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("child thread");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
class DT{
    public static void main(String[] args) {
        My t=new My();
        t.setDaemon(true);
        t.start();
        System.out.println("end of main");
    }
}
