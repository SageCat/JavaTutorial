package $08_thread;

public class ThreadDemo
{
    public static void main(String[] args)
    {
        Thread sage = new Person("Sage");
        sage.start();
        Person tom = new Person("Tom");
        tom.start();

        for (int i = 0; i < 30; i++)
        {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 20; i++)
                {
                    System.out.println(Thread.currentThread().getName() + "======== Runnable Interface");
                }
            }
        }).start();
    }
}
