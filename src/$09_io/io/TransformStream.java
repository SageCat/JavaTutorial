package $09_io.io;

import java.io.*;

public class TransformStream
{
    public static void main(String[] args) throws IOException
    {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("res/utf-8.txt"), "utf-8");
        outputStreamWriter.write("我是郭帅强");
        outputStreamWriter.flush();
        outputStreamWriter.close();

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("res/utf-8.txt"), "utf-8");
        BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader);
        int pos = -1;
        while ((pos = bufferedInputStream.read()) != -1)
        {
            System.out.println((char) pos);
        }
        bufferedInputStream.close();
    }
}
