package java_io.learn_file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class GetFileList
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\g84196891\\Downloads");
        FileOutputStream fileOutputStream = new FileOutputStream("res/dir.txt");
        getList(file, fileOutputStream);
        fileOutputStream.close();
    }

    private static void getList(File file, FileOutputStream fileOutputStream) throws IOException
    {
//        System.out.println("========================");
//        System.out.println(file);
        File[] files = file.listFiles((filename) -> filename.isDirectory() || filename.getName().toLowerCase().endsWith(".mp4"));
        for (File file1 : files)
        {
            if (file1.isDirectory())
            {
                getList(file1, fileOutputStream);
            }
            else
            {
                System.out.println("==========================");
                System.out.println(file1);
                fileOutputStream.write("================\n".getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write(file1.toString().getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write("\n".getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
