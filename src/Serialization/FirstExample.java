package Serialization;

import java.io.*;

public class FirstExample implements Serializable {
    int i=10;
    int j =20;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        FirstExample f1 = new FirstExample();
        System.out.println("Before Serialization values are: "+f1.i+"   "+f1.j);
        oos.writeObject(f1);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        FirstExample f2=(FirstExample)ois.readObject();
        System.out.println("After Serialization values are: "+f2.i+"   "+f2.j);
    }
}
