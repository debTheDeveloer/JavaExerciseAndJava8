package Serialization;
import java.io.*;

public class SerializationSequence {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat c = new Cat(10);
        Dog d = new Dog(20);

        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Before Serialization the values are: "+c.i+"   "+d.j);
        oos.writeObject(c);
        oos.writeObject(d);

        /*FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat c2 = (Cat) ois.readObject();
        Dog d2 = (Dog) ois.readObject();

        System.out.println("After Serialization the values are: "+c2.i+"   "+d2.j);*/

        //Another way to read the values
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat c2=null;
        Dog d2=null;
        for(int i=0;i<2;i++) {
            Object o = ois.readObject();
            if (o instanceof Dog) {
                d2 = (Dog) o;
            } else if (o instanceof Cat) {
                c2 = (Cat) o;
            }
        }
        System.out.println("After Serialization the values are: "+c2.i+"   "+d2.j);
    }
}
