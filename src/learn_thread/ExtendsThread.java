package learn_thread;

/**
* 通过继承 Thread 类的方法，创建一个 Thread 类的子类
 * 实现步骤：
 *  1. 创建一个 Thread 的子类
 *  2. 在创建的子类中重写 Thread 类的 run() 方法，设置线程任务（线程要执行的代码）
 *  3. 创建这个子类的一个实例对象
 *  4. 通过实例对象调用 start() 方法即可开启线程并执行 run() 方法
 * @author g84196891
 */
public class ExtendsThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            try
            {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " -----> " + i);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}
