package $08_thread;

public class TicketTest
{
    public static void main(String[] args)
    {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        Thread thread3 = new Thread(ticket);
        thread1.start();
        thread2.start();
        thread3.start();


        new Thread(() ->
                   {
                       for (int i = 0; i < 20; i++)
                       {
                           System.out.println(Thread.currentThread().getName() + ">>>>>>>>>> " + i);
                       }
                   }).start();
    }
}
