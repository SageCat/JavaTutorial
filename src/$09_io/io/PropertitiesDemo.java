package $09_io.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertitiesDemo
{
    public static void main(String[] args) throws IOException
    {
        /*创建一个Properties对象*/
        Properties properties = new Properties();
        /*存放键值对数据*/
        properties.setProperty("Sage", "27");
        properties.setProperty("Sage1", "2");
        properties.setProperty("Sage2", "30");
        /*将 Properties 对象中的数据存储到 字符输出流的文件中去*/
        properties.store(new FileWriter("res/prop.txt"), "hahah");

        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings)
        {
            String property = properties.getProperty(string);
            System.out.println(property);
        }
    }
}
