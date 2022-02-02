package learn_thread;

public class ImplRunnableTest
{
    public static void main(String[] args) throws InterruptedException
    {
        ImplRunnable implRunnable = new ImplRunnable();
        Thread thread = new Thread(implRunnable);
        thread.start();

        /* main线程 */
        for (int i = 0; i < 20; i++)
        {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " --- Main " + i);
        }
    }
}
