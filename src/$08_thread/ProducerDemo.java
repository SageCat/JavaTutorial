package $08_thread;

/**
 * @author g84196891
 */
public class ProducerDemo implements Runnable
{
    private TicketDemo ticket;

    public ProducerDemo(TicketDemo ticket)
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
                    int ticketNumber = ticket.getTicket();
                    if (ticketNumber < 20)
                    {
                        Thread.sleep(50);
                        ticketNumber++;
                        System.out.println(Thread.currentThread().getName() + " ------Producer ---->" + ticketNumber);
                        ticket.setTicket(ticketNumber);
                        ticket.notifyAll();
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
