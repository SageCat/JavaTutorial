package $07_exception;

/*
 * 自定义异常类：
 *   格式：
 *       public class xxxException extends Exception | RuntimeException
 *       {
 *           添加一个空参的构造方法
 *           添加一个带有异常信息的构造方法
 *       }
 *   注意：
 *       1. 一般自定义异常类的名字都以 Exception 结尾
 *       2. 自定异常类，必须继承 Exception 或者 RuntimeException
 *           继承 Exception： 自定义的异常类是一个编译期异常，如果方法内抛出了编译期异常，则必须处理这个异常，采用 throws 或 try{} catch(){} 均可
 *           继承 RuntimeException： 自定义的异常是一个运行时异常，无需对其进行处理，虚拟机会采用中断程序的方法进行处理
 * */

/**
 * @author g84196891
 */
public class SelfDefineException extends Exception
{
    // 空参构造方法
    public SelfDefineException()
    {
        super();
    }

    // 带有异常信息的构造方法
    public SelfDefineException(String message)
    {
        super(message);
    }

}
