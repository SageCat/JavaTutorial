package $08_thread;

public class ConsumerDemo implements Runnable
{
    private TicketDemo ticket;

    public ConsumerDemo(TicketDemo ticket)
    {
        this.ticket = ticket;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (ticket)
            {
                try
                {
                    Thread.sleep(50);
                    int ticketNumber = ticket.getTicket();
                    if (ticketNumber > 0)
                    {
                        System.out.println(Thread.currentThread().getName() + " Consumer ========>" + ticketNumber);
                        ticketNumber--;
                        ticket.setTicket(ticketNumber);
                    }
                    else if (ticketNumber == 0)
                    {
                        ticket.wait();
                    }
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
