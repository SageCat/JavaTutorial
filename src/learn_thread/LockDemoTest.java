package learn_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author g84196891
 */
public class LockDemoTest
{
    public static void main(String[] args)
    {
        TicketDemo ticketDemo = new TicketDemo();
        ConsumerDemo consumerDemo = new ConsumerDemo(ticketDemo);
        ProducerDemo producerDemo = new ProducerDemo(ticketDemo);

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        executorService.submit(consumerDemo);
        executorService.submit(consumerDemo);
        executorService.submit(consumerDemo);
        executorService.submit(consumerDemo);
        executorService.submit(consumerDemo);
        executorService.submit(producerDemo);
        executorService.submit(producerDemo);
        executorService.submit(producerDemo);
    }
}
