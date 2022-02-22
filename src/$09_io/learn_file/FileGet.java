package $09_io.learn_file;

import java.io.File;
import java.io.IOException;

/**
 * 获取的方法：
 * File getAbsoluteFile()：获取绝对路径的方法
 */

public class FileGet
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\g84196891\\.jdks\\corretto-11.0.13\\bin");
        File file2 = new File("a.md");
        System.out.println("getAbsoluteFile ---> " + file.getAbsoluteFile());
        System.out.println("getAbsolutePath ---> " + file.getAbsolutePath());
        System.out.println("getPath ---> " + file.getPath());
        System.out.println("getName ---> " + file.getName());
        System.out.println("length ---> " + file.length());
        System.out.println("=================================");
        System.out.println("getAbsoluteFile ---> " + file2.getAbsoluteFile());
        System.out.println("getAbsolutePath ---> " + file2.getAbsolutePath());
        System.out.println("getPath ---> " + file2.getPath());
        System.out.println("getName ---> " + file2.getName());
        System.out.println("length ---> " + file2.length());

        System.out.println("==================================");
        System.out.println(file.exists());
        System.out.println(file2.exists());
        System.out.println(file.isDirectory());
        System.out.println(file2.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file2.isFile());

        System.out.println("==================================");
        /*创建成功返回 true， 创建失败或已存在则返回 false*/
        System.out.println(file2.createNewFile());
        /*删除成功返回 true， 删除失败或已不存在则返回 false*/
        System.out.println(file2.delete());

        System.out.println("==================================");
        File file3 = new File("c:\\");
        /*返回的是file的名称，不包含路径*/
        String[] list = file3.list();
        for (String s : list)
        {
            System.out.println(s);
        }

        System.out.println("==================================");
        /*返回的是File对象，包含路径*/
        File[] files = file3.listFiles();
        for (File f : files)
        {
            System.out.println(f);
        }

    }
}
