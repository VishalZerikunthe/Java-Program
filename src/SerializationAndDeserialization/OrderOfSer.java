package SerializationAndDeserialization;

import java.io.*;

class Dog{

}
class Cat{

}
class Rat{

}
public class OrderOfSer implements Serializable {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Dog D=new Dog();
        Cat C=new Cat();
        Rat R=new Rat();
        //serialize
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(D);
        oos.writeObject(C);
        oos.writeObject(R);

        //deserialize
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog D1=(Dog) ois.readObject();
        Cat C1=(Cat) ois.readObject();
        Rat R1=(Rat) ois.readObject();
    }
}
//We can serialize any number of objects to the file, but in which order we serialized in same
// order only we have to deserialize that is serialization in order of objects is important