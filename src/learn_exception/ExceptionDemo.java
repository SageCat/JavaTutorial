package learn_exception;

/*
    java.lang.Throwable 是异常和错误的超类
        java.lang.Exception：编译器异常，在运行时可能产生的异常
        java.lang.Error：错误，必须修改源码才可以解决的问题


    异常产生的过程：
        1. jvm检测出异常
        2. 根据异常产生的原因创建一个对象，这个对象包含异常产生的（内容，原因，位置）
        3. 如果产生异常的代码没有做 try{}catch{} 处理，则会将异常抛给代码的调用者
        4. 若代码中都没有对异常做出处理，则最终会由main方法将异常抛给jvm
        5. jvm收到异常后，会把异常对象(内容，原因，位置)打印到控制台，且jvm对程序进行中断处理

    异常的处理：
        1. throw：可以抛出指定的异常--> throw new xxxException(”异常产生的原因“)
            throw 关键字必须写在方法内部
            throw 后new的对象必须是Exception对象或其子类对象
            throw 后new的对象如果是 RuntimeException或其子类对象，则会由jvm自动处理
        2.

 */

import java.util.Objects;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        throwException();

        objectIsNull("sage");
    }

    private static void objectIsNull(Object o)
    {
        /*对象非空判断，如果为空，则中断程序，若不为空，则返回对象*/
        System.out.println(Objects.requireNonNull(o));
    }

    private static void throwException()
    {
        int[] ints = new int[3];
        int index = 2;
        getElement(ints, index);
    }

    private static int getElement(int[] ints, int index)
    {
        if (ints == null)
        {
            throw new NullPointerException("the array is null");
        }
        else if (index < 0 || index > ints.length - 1)
        {
            throw new ArrayIndexOutOfBoundsException("the index is out of the array size");
        }

        return ints[index];
    }
}
