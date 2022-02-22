package $08_thread;

public class Person extends Thread
{
    private String name;
    private int age;

    @Override
    public void run()
    {
        for (int i = 0; i < 20; i++)
        {
            System.out.println(Thread.currentThread().getName() + "--->" + name + "--->" + i);
        }
    }

    public Person(String name)
    {
        this.name = name;
    }
}
