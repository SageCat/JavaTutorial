package $09_io.io;

import java.io.*;

public class SerilizableDemo
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Person sage = new Person("sage", 29);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("res/objects.txt"));
        objectOutputStream.writeObject(sage);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("res/objects.txt"));
        Object object = objectInputStream.readObject();
        if (object instanceof Person)
        {
            System.out.println((Person)object);
        }
        objectInputStream.close();
    }
}
