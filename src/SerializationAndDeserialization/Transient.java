package SerializationAndDeserialization;

import java.io.*;

public class Transient implements Serializable {
    int a=10;
    int b=20;
    transient int trn=10;
    transient static int stat=20;
    transient final int fin=30;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Transient obj1=new Transient();
        //serialize obj
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj1);

        //deserialize obj
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Transient obj2=(Transient) ois.readObject();
        System.out.println(obj2.a+" "+obj2.b);
        System.out.println(obj2.trn);
        System.out.println(obj2.stat);
        System.out.println(obj2.fin);
    }
}
