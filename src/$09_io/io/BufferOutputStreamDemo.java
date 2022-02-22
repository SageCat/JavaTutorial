package $09_io.io;

import java.io.*;

public class BufferOutputStreamDemo
{
    public static void main(String[] args)
    {

        long start = System.currentTimeMillis();

        try (
                FileInputStream fileInputStream = new FileInputStream("res/dir.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("res/dir_copy.txt");

                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        )
        {
            int len = 0;
            while ((len = bufferedInputStream.read()) != -1)
            {
                bufferedOutputStream.write(len);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("增加缓冲区后消耗时间为： " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();

        try (
                FileInputStream fileInputStream = new FileInputStream("res/dir.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("res/dir_copy2.txt");
        )
        {
            int len = 0;
            while ((len = fileInputStream.read()) != -1)
            {
                fileOutputStream.write(len);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("去掉缓冲区后消耗时间为： " + (System.currentTimeMillis() - start));
    }
}
