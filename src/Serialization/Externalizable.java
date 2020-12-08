package Serialization;

import java.io.*;

public class Externalizable implements java.io.Externalizable {
    int i;
    int j;
    String name;

    public Externalizable(int i, int j, String name) {
        this.i = i;
        this.j = j;
        this.name = name;
    }

    public Externalizable() {  //This constrctor is important
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(i);
        objectOutput.writeObject(name);

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        i=objectInput.readInt();
        name=(String) objectInput.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Externalizable ex = new Externalizable(10,20,"Arka");
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Before Serilalization...."+ex.name+"  "+ex.i+"   "+ex.j);
        oos.writeObject(ex);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Externalizable ex2 = (Externalizable) ois.readObject();
        System.out.println("After Serilalization...."+ex2.name+"  "+ex2.i+"   "+ex2.j);


    }
}
