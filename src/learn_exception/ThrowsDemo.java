package learn_exception;
/*
    throws: 这是处理异常的第一种方式，即交给别人处理
    作用：
        当方法内部抛出异常对象的时候，我们就必须对这个异常对象进行处理
        可以使用 throws 关键字进行处理，会把异常对象声明抛出给方法的调用者，最终会交给 jvm 进行处理
        使用格式：
            1. 在方法声明时使用，通常配合 throw 来使用
            2. 修饰符 返回值类型 方法名(参数) throws xxxException,yyyException{
                throw new xxxException();
                throw new yyyException();
            }
        注意事项：
            1. throws 关键字必须写在方法的声明处
            2. throws 抛出的类必须是Exception类或其子类
            3. 若方法中抛出了多个异常对象，则 throws 后也应该声明多个异常类
            4. 若方法中抛出的多个异常对象有父子类关系，则 throws 后只抛出父异常类即可
            5. 若调用了一个声明抛出异常的方法，就必须对声明的异常进行处理，方法有2种：
                a. 继续使用 throws 进行异常的抛出操作，交给方法的调用者处理，最终会交给 jvm 进行处理，程序会立即中断，不会执行后续代码
                b. 使用 try...catch{} 自己对异常进行处理，会打印出异常信息，并且继续执行后续代码
    finally：
        1. finally 无法单独使用，必须配合 try...catch{}
        2. finally 一般用于资源的释放

    处理多个异常：
        1. try一次，处理一个：每个异常都用一个 try...catch(){} 代码块进行处理
        2. try一次，处理多个：所有的代码都放在 try代码块里，进行多次 catch，try{} catch(){} catch(){} catch(){}
            如果多个被 catch 的异常类之间有父子关系，则应该将子类异常放在前面，父类异常放在后面
        3. try多个，处理一次： try{} catch(Exception e){}, 即使用异常的超类 Exception或所有可能的异常的总的父类 来进行处理
 */

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author g84196891
 */
public class ThrowsDemo
{
    public static void main(String[] args)
    {

        try
        {
            readFile("c:/a.txt");
            // 若上面的代码出现异常，则下面的代码不会被执行
            System.out.println("资源释放");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
            System.out.println("=======================");
            System.out.println(e.toString());
            System.out.println(e);
            System.out.println("=======================");
            e.printStackTrace();
        }
        finally
        {
            // 无论是否出现异常，finally 代码块里的代码都会被执行
            System.out.println("资源释放");
        }

        System.out.println("后续代码");
    }

//    FileNotFoundException 不属于 RuntimeException，而是属于编译时异常，因此需要使用 throws 进行抛出

    public static void readFile(String filePath) throws FileNotFoundException, IOException
    {
        if (!filePath.equals("c:/a.txt"))
        {
            throw new FileNotFoundException("The Fine directory is not correct");
        }
        else if (!filePath.endsWith(".txt2"))
        {
            throw new IOException("File type is not txt");
        }

        System.out.println("the file directory is c:/a.txt");
    }
}
