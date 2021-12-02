package object;

public class ObjectTest
{
    public static void main(String[] args)
    {
        /*
        Person 类默认继承了Object类，所以可以执行Object类中的方法
        但大多数情况下，子类是会根据实际需要对Object类中的方法进行重写的，如 toString()、equals()
         */
        Person p = new Person();
        System.out.println(p.toString());
    }
}
