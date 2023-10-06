package SerializationAndDeserialization;

import java.io.*;

class Demo implements Serializable{
    int i=10;
    int j=20;
}
public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Demo d1=new Demo();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Demo d2= (Demo) ois.readObject();
        System.out.println(d2.i+" "+d2.j);
    }
}
