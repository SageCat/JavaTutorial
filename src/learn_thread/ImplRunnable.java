package learn_thread;

/**
 * 创建多线程的第二种方法： 实现 Runnable 接口， 必须重写无参的 run() 方法
 * 实现步骤：
 *  1. 创建一个 Runnable 接口的实现类
 *  2. 在实现类中重写 Runnable 接口的 run() 方法，设置线程任务
 *  3. 创建一个 Runnable 接口的实现类对象
 *  4. 创建一个 Thread 类对象，并将 Runnable 接口的实现类对象作为参数传递进去
 *  5. 调用 Thread 实现类对象的 start() 方法
 */

public class ImplRunnable implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            try
            {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " ->>>>> " + i);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
