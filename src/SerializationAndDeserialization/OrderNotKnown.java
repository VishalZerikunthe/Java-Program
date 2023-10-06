package SerializationAndDeserialization;

import java.io.*;

class Dog1{

}
class Cat1{

}
class Rat1{

}
public class OrderNotKnown implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog1 D = new Dog1();
        Cat1 C = new Cat1();
        Rat1 R = new Rat1();
        //serialize
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(D);
        oos.writeObject(C);
        oos.writeObject(R);
        //deserialize
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object o=ois.readObject();
        if(o instanceof Dog1){
            Dog1 D1=(Dog1) o;
            //perform dog specific functionality
        }
        else if (o instanceof Cat1){
            Cat1 C1=(Cat1) o;
            //perform cat specific functinality
        } else if (o instanceof Rat1) {
            Rat1 R1=(Rat1) o;
            //perform rat specific functinality

        }
    }
}
