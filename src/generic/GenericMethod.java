package generic;

import java.util.Iterator;
import java.util.List;

public class GenericMethod
{
    /**
     * 在 修饰符 和 返回值类型 之间定义泛型类型，在参数列表里使用 泛型
     * <p>
     * 修饰符 <泛型>  返回值类型  方法名(泛型)
     * {方法体;}
     */

    /** 非静态类型泛型方法 */
    public <E> void method(E e)
    {
        System.out.println(e);
    }

    /** 静态类型的泛型方法 */
    public static <E> void staticMethod(E e)
    {
        System.out.println(e);
    }

    /** 参数中使用泛型通配符 ? 来接收不同类型泛型的对象引用 */
    public static void printArray(List<?> list)
    {
        for (Object o : list)
        {
            System.out.println(o);
        }

        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
