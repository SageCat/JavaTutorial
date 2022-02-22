package $08_thread;

/**
 * @author g84196891
 */
public class Ticket implements Runnable
{

    private int ticket = 20;
    /* 锁对象 */
    String lock = "lock";

    @Override
    public void run()
    {
        while (true)
        {
            /* 对具有共享数据的代码加锁 */
            synchronized (lock)
            {
                if (ticket > 0)
                {
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " this is ticket " + ticket);
                    ticket--;
                }
            }
        }
    }
}
