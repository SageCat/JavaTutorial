package learn_thread;

public class InnerClassDemo
{
    public static void main(String[] args)
    {
        new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    try
                    {
                        sleep(100);
                        System.out.println(Thread.currentThread().getName() + "---->" + i);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    try
                    {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + "---->" + i);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }
}
