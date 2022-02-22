package $09_io.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * FileOutputStream：文件字节输出流，旨在将内存中的数据写入到硬盘的文件中
 *  构造方法：
 *  FileOutputStream(File file)
 *  FileOutputStream(String name)
 *      作用：
 *          1. 创建一个 FileOutputStream 对象
 *          2. 根据构造方法中传入的参数创建一个文件
 *          3. 将 FileOutputStream 对象指向该文件
 *
 * 写入数据的原理（内存 ---> 硬盘）：java程序 ---> JVM --> 操作系统 ---> 调用写入数据的方法 ---> 把数据写入到文件中
 *
 * 字节流输出的步骤（3步）：
 *      1. 创建一个 FileOutputStream 对象，并在构造方法中传入要创建的文件路径
 *      2. 调用 FileOutputStream 对象的 write() 方法将数据写入到文件中
 *      3. 调用 FileOutputStream 对象的 close() 或 flush() 方法对资源进行释放
 *
 * @author g84196891
 */

public class FileOutputStreamDemo
{
    public static void main(String[] args) throws IOException
    {
        /*创建 FileOutputStream 对象*/
        FileOutputStream fileOutputStream = new FileOutputStream("res/result.txt");
        /*写入数据*/
        fileOutputStream.write("郭帅强".getBytes(StandardCharsets.UTF_8));
        /*释放资源*/
        fileOutputStream.close();
    }
}
