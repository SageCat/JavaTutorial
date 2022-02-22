package $08_thread;

/**
 * @author g84196891
 */
public class ExtendsThreadTest
{
    public static void main(String[] args) throws InterruptedException
    {
        ExtendsThread extendsThread = new ExtendsThread();
        ExtendsThread extendsThread1 = new ExtendsThread();
        extendsThread.start();
        extendsThread1.start();
        /* main线程 */
        for (int i = 0; i < 20; i++)
        {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " --- Main " + i);
        }
    }
}
