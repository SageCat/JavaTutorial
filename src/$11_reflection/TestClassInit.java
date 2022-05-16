package $11_reflection;

public class TestClassInit
{
    static
    {
        System.out.println("This is main static block");
    }

    public static void main(String[] args) throws ClassNotFoundException
    {

        System.out.println("================会导致类进行初始化的场景（主动引用）================");
        /**
         * 通过 new 关键字来初始化对象
         */
        Student student = new Student();

        /**
         * 通过 类加载器
         */
        Class<?> aClass = Class.forName("$11_reflection.Student");

        /**
         * 通过 引用当前类的静态变量
         */
        String studentLabel = Student.studentLabel;

        System.out.println("================不会导致类进行初始化的场景（被动引用）================");
        /**
         * 通过 引用父类的静态变量 不会导致类进行初始化，只会导致父类初始化
         */
        String label = Student.label;

        /**
         * 通过数组引用
         */
        Student[] students = new Student[5];

        /**
         * 声明变量， 同通过数组引用
         */
        Student studentNull;

        /**
         * 调用 final 修饰的静态变量， 而调用未经过 final 修饰的静态变量会导致当前类进行初始化
         */
        String classLevel = Student.classLevel;

        System.out.println(System.getProperty("java.class.path"));

    }
}

class Human
{
    public static String label = "Human";

    static
    {
        System.out.println("This is the person class static block");
    }
}

class Student extends Human
{
    public static String studentLabel = "Student";
    public static final String classLevel = "初中";

    static
    {
        System.out.println("This is the student class static block");
    }
}
