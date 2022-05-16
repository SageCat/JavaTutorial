package $11_reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author g84196891
 */
public class GetRuntimeClassStructr
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    {
        /**
         * 通过反射可以获取到运行时类的完整结构
         *  1. 字段
         *  2. 方法
         *  3. 构造函数
         *  4. 父类
         *  5. 接口
         *  6. 注解等
         */

        Class<?> aClass = Class.forName("$11_reflection.Person");

        /**
         * 获取类名
         *     包名.类名
         *     类名
         */
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        /**
         * 获取类的成员变量（类属性）
         *      获取 public 属性
         *      获取所有属性
         */
        Field[] publicFields = aClass.getFields();
        Field[] allFields = aClass.getDeclaredFields();

        for (Field publicField : publicFields)
        {
            System.out.println(publicField);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (Field allField : allFields)
        {
            System.out.println(allField);
        }

        System.out.println(">>>>>>>>>>>>>>>获取成员函数>>>>>>>>>>>>>>>>>");
        /**
         * 获取类的成员函数
         *      获取本类及其父类的 public 函数
         *      获取本类的 所有函数
         */
        Method[] publicMethods = aClass.getMethods();
        Method[] allMethods = aClass.getDeclaredMethods();
        Method enclosingMethod = aClass.getEnclosingMethod();

        for (Method publicMethod : publicMethods)
        {
            System.out.println("公共函数： " + publicMethod);
        }

        for (Method allMethod : allMethods)
        {
            System.out.println("所有函数： " + allMethod);
        }

        System.out.println("enclosing method");
        System.out.println(enclosingMethod);

        System.out.println(">>>>>>>>>>>>>>>获取注解>>>>>>>>>>>>>>>>>");
        for (AnnotatedType annotatedInterface : aClass.getAnnotatedInterfaces())
        {
            System.out.println(annotatedInterface);
        }
        System.out.println(aClass.getAnnotatedSuperclass());
        for (Annotation annotation : aClass.getAnnotations())
        {
            System.out.println(annotation);
        }

        System.out.println(">>>>>>>>>>>>>>>>>");
        /**
         * 通过 Class 对象创建对象
         *      直接使用 newInstance 来创建对象已经过时了
         *      需要点调用 getDeclaredConstructor() 方法并传入参数，再调用 newInstance() 也传入参数 来创建对象
         */
        Object person = aClass.getDeclaredConstructor(String.class, Integer.TYPE, String.class).newInstance("Sage", 54, "shenzhen");
        System.out.println(person);

        if (person instanceof Person)
        {
            ((Person) person).setName("hello");

            System.out.println(((Person) person).getName());
            System.out.println(person);
        }
    }
}
