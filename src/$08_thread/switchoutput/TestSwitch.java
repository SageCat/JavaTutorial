package $08_thread.switchoutput;

public class TestSwitch
{
    public static void main(String[] args)
    {
        SellTicket ticket = new SellTicket(2000);

        Thread thread = new Thread(ticket, "小王");
        Thread thread1 = new Thread(ticket, "小红");
        thread.start();
        thread1.start();
    }
}


class SellTicket implements Runnable
{
    private final String LOCK = "lock";
    private boolean flag = true;

    private int tickerNumber;

    public SellTicket(int tickerNumber)
    {
        this.tickerNumber = tickerNumber;
    }


    @Override
    public void run()
    {
        synchronized (LOCK)
        {
            while (tickerNumber > 0)
            {
                try
                {
                    if (flag)
                    {
                        System.out.println(Thread.currentThread().getName() + ">>>在买第" + tickerNumber-- + "张票！！！");
                    }
                    flag = !flag;
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
