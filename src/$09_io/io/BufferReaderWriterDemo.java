package $09_io.io;

import java.io.*;

public class BufferReaderWriterDemo
{
    public static void main(String[] args)
    {
        try (
                FileReader fileReader = new FileReader("res/dir.txt");
                FileWriter fileWriter = new FileWriter("res/dir_writer.txt");

                BufferedReader bufferedReader = new BufferedReader(fileReader, 200);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        )
        {
            String line = null;
            /*每次读一行*/
            while ((line = bufferedReader.readLine()) != null)
            {
                bufferedWriter.write(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
