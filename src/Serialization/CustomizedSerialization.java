package Serialization;

import java.io.*;

public class CustomizedSerialization implements Serializable {
    int i;
    transient String name;

    public CustomizedSerialization(int i, String name) {
        this.i = i;
        this.name = name;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String name2= "ABC"+this.name;
        System.out.println("Hello");
        oos.writeObject(name2);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String name2 = (String) ois.readObject();
        System.out.println("Name2 is: "+name2);
        name= name2.substring(3);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CustomizedSerialization cis = new CustomizedSerialization(10,"Arka");
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Before Customized Serializaation: "+cis.name+"  "+cis.i);
        oos.writeObject(cis);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        CustomizedSerialization cis2 = (CustomizedSerialization) ois.readObject();
        System.out.println("After Customized Serializaation: "+cis2.name+"  "+cis2.i);



    }
}
