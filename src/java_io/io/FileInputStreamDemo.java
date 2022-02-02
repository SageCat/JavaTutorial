package java_io.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("res/dir.txt");
        int len = fileInputStream.read();
        byte[] buf = new byte[1000];
        while ((len = fileInputStream.read(buf)) != -1)
        {
            System.out.print(new String(buf, 0, len));
        }
        fileInputStream.close();
    }
}
