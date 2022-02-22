package $09_io.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo
{
    public static void main(String[] args) throws FileNotFoundException
    {
/*        FileInputStream fileInputStream = new FileInputStream("res/dir.txt");
        int len = fileInputStream.read();
        byte[] buf = new byte[1000];
        while ((len = fileInputStream.read(buf)) != -1)
        {
            System.out.print(new String(buf, 0, len));
        }
        fileInputStream.close();*/



        // JDK 7.0 开始，可以在 try 代码块后面的括号中添加上初始化的对象，则不用进行资源释放的操作
        try (FileInputStream fileInputStream = new FileInputStream("res/dir.txt"))
        {
            int len = fileInputStream.read();
            byte[] buf = new byte[1000];
            while ((len = fileInputStream.read(buf)) != -1)
            {
                System.out.print(new String(buf, 0, len));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // JDK 9.0 开始，可以在 try 代码块后面的括号中添加上初始化的对象，则不用进行资源释放的操作
        FileInputStream fileInputStream = new FileInputStream("res/dir.txt");
        try (fileInputStream)
        {
            int len = fileInputStream.read();
            byte[] buf = new byte[1000];
            while ((len = fileInputStream.read(buf)) != -1)
            {
                System.out.print(new String(buf, 0, len));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
