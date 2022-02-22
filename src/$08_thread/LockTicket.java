package $08_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTicket implements Runnable
{
    private int ticket = 100;
    /* 创建一个锁 */
    private Lock lock = new ReentrantLock();


    @Override
    public void run()
    {
        while (true)
        {
            /* 开始锁 */
            lock.lock();
            try
            {
                if (ticket > 0)
                {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "---->" + ticket);
                    ticket--;
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }finally
            {
                /* 放在 finally 代码块中，无论是否触发异常，都会释放锁 */
                lock.unlock();
            }
        }
    }
}
