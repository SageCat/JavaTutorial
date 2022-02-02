package learn_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketDemo
{
    private int ticket = 20;

    public int getTicket()
    {
        return ticket;
    }

    public void setTicket(int ticket)
    {
        this.ticket = ticket;
    }
}
