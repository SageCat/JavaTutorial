package generic;

import java.sql.Array;
import java.util.ArrayList;

/**
 * @author g84196891
 */
public class UseGeneric
{
    public static void main(String[] args)
    {
        /*创建ArrayList对象，指定泛型的值为String*/
        ArrayList<String> stringArrayList = new ArrayList<>();
        /*只能添加字符串类型的数据*/
        stringArrayList.add("sage");


        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        integerGenericClass.setValue(123);
        System.out.println(integerGenericClass.getValue());

        GenericClass<String> stringGenericClass = new GenericClass<>();
        stringGenericClass.setValue("sage");
        System.out.println(stringGenericClass.getValue());


        /** 创建对象，使用对象调用非静态的泛型方法*/
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.method(1);
        genericMethod.method("sage");
        genericMethod.method(true);

        /** 直接使用类名调用 静态的泛型方法*/
        GenericMethod.staticMethod(2);
        GenericMethod.staticMethod("Candy");
        GenericMethod.staticMethod(false);
        System.out.println("==========================");

        /** 创建第一种泛型接口实现类的对象， 只能传String类对象*/
        GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
        genericInterface.method("hahhahhaa");
        System.out.println("==========================");
        /** 创建第二种泛型接口实现类的对象， 可以传任意类型的对象 */
        GenericInterfaceImpl2<Object> stringGenericInterfaceImpl2 = new GenericInterfaceImpl2<>();
        stringGenericInterfaceImpl2.method("sage");
        stringGenericInterfaceImpl2.method(123);
        stringGenericInterfaceImpl2.method(true);

        System.out.println("==========================");

        /** stringArrayList1 是 String 类泛型的 变量 */
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("sage");
        stringArrayList1.add("Candy");
        /** 调用静态方法 printArray， 该方法需要有泛型通配符 */
        GenericMethod.printArray(stringArrayList1);

        /** integerArrayList 是 Integer 类泛型的 变量 */
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(23);
        integerArrayList.add(27);
        /** 调用静态方法 printArray， 该方法需要有泛型通配符 */
        GenericMethod.printArray(integerArrayList);
    }
}
