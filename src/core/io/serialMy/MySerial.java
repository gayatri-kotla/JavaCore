package core.io.serialMy;

import java.io.*;

public class MySerial {
    public static void serializeObject(Emp e) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Downloads\\dsaPractice\\javacore\\src\\core\\io\\serialMy\\mydata.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        fos.close();
        oos.close();
    }
    public static Emp deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\dsaPractice\\javacore\\src\\core\\io\\serialMy\\mydata.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Emp e = (Emp)ois.readObject();
return e;

    }
}

class demo{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emp e = new Emp("fghj",67);
        MySerial.serializeObject(e);
        Emp ee=MySerial.deserialize();
        System.out.println(ee);
    }
}
