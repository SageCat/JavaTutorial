package $11_reflection;

import java.lang.reflect.Constructor;

/**
 * @author g84196891
 */
public class ReflectTest
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        /**
         *  forName() 的参数字符串是  包名.类名
         *
         *  每个类只有一个 Class 对象，因此对 同一个 类多次获取 Class 对象，获得的结果都是一样的.
         *
         *  类加载内存分析：
         *  1. class 字节码文件会被先加载到内存的方法区中
         *  2. 在 类加载时 就已经生成了 Class 对象
         *  3. （链接）执行 main 方法
         *      执行 main 方法时，会为 静态的类变量分配内存空间并设置默认初始值
         *
         *  创建 Class 对象的方法有好多种
         *      1. 通过 类名.class 获得
         *      2. 通过 对象名.getClass() 获得
         *      3. 通过 Class.forName("包名.类名") 获得
         *      4. 利用 ClassLoader 获得
         */
        // 通过 Class.forName("包名.类名") 获得
        Class<?> aClass = Class.forName("$11_reflection.Person");
        System.out.println(aClass.hashCode());

        // 通过 类名.class 获得
        Class<Person> personClass = Person.class;
        System.out.println(personClass.hashCode());

        // 通过 对象名.getClass() 获得
        Person sage = new Person("Sage");
        Class<? extends Person> sageClass = sage.getClass();
        System.out.println(sageClass.hashCode());

        /**
         * 基本数据类型的包装类可以通过 类名.TYPE 获得 Class对象
         */

        Class<Integer> integerClass = Integer.class;
        Class<Integer> integerClass1 = Integer.TYPE;

        System.out.println(Integer.class);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.class.hashCode());
        System.out.println(Integer.TYPE.hashCode());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>");

        String name = aClass.getName();
        System.out.println("class name is " + name);

        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors)
        {
            System.out.println("the constructor is " + constructor);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        LoadTest loadTest = new LoadTest();
        LoadTest loadTest2 = new LoadTest();
        System.out.println("The value of m is " + LoadTest.m);
        System.out.println("The value of m is " + LoadTest.m);

    }
}

class Person
{
    public String name;
    private int age;

    public Person(String name)
    {
        this.name = name;
    }

    public Person(int age)
    {
        this.age = age;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String address;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}


class LoadTest
{

    {
        System.out.println("this is the constructor code block");
        m = 500;
    }

    static
    {
        System.out.println("this is the static code block");
        m = 200;
    }

    public static int m = 100;

    public LoadTest()
    {
        System.out.println("This is the constructor of LoadTest");
    }
}