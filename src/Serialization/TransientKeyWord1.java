package Serialization;

import java.io.*;

public class TransientKeyWord1 implements Serializable {
    int i ;
   transient String name;

    public TransientKeyWord1(int i, String name) {
        this.i = i;
        this.name = name;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        TransientKeyWord1 ts = new TransientKeyWord1(10,"Arka");
        System.out.println("Before Serialization the values are: "+ts.name+"  "+ts.i);
        oos.writeObject(ts);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TransientKeyWord1 ts1 = (TransientKeyWord1) ois.readObject();
        System.out.println("After Serialization the values are: "+ts1.name+"  "+ts1.i);

    }
}
