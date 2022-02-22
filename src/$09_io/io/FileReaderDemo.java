package $09_io.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
    public static void main(String[] args)
    {
        try (
                FileReader fileReader = new FileReader("res/dir.txt");
        )
        {
            char[] temp = new char[100];
            int len = 0;
            while ((len = fileReader.read(temp)) != -1)
            {
                Thread.sleep(50);
                System.out.print((new String(temp, 0, len)));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
