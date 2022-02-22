package $01_basic;

public class WrapperDemo
{
    public static void main(String[] args)
    {
        wrapperToClass();
        System.out.println("===================");
        unWrapperToBasic();
        System.out.println("===================");
        autoWrapper();
        basicToString();
        System.out.println("===================");
    }

    private static void basicToString()
    {
        /*
         * 基本数据类型 -> 字符串
         *   1. 直接加 “”
         *   2. 使用基本数据类型包装类的 toString 方法
         *   3. 使用 String 类的 valueOf 方法
         */

        String s1 = 100 + "";
        System.out.println("s1 + 100 = " + (s1 + 100));
        System.out.println("----------------------");
        String s2 = Integer.toString(100);
        System.out.println("s2 + 100 = " + (s2 + 100));
        System.out.println("----------------------");
        String s3 = String.valueOf(100);
        System.out.println("s3 + 100 = " + (s3 + 100));
        System.out.println("----------------------");

        /*
         * 字符串 -> 基本数据类型
         *  使用包装类的静态 parse 方法
         */
        int i1 = Integer.parseInt("100");
        System.out.println("i1 + 200 = " + (i1 + 200));
        System.out.println(Integer.parseInt("10000"));
    }

    private static void autoWrapper()
    {
        /*100是int类型，自动装箱称为Integer类型*/
        Integer value = 100;
        Integer valueTwo = 300;

        /*value是Integer类型，自动拆箱到int类型再参与计算，计算完毕后，结果值为int类型*/
        value = value + 20;

        System.out.println(valueTwo);
        System.out.println(value instanceof Integer);
    }

    private static void unWrapperToBasic()
    {
        /* 拆箱 */
        Integer integer = new Integer(23455);
        int i = integer.intValue();
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }

    private static void wrapperToClass()
    {
        /*第一种装箱方法*/
        int age = 23;
        Integer integer = new Integer(age);
        Integer integer1 = new Integer("123");
        System.out.println(integer);
        System.out.println(integer1);

        /*第二种装箱方法*/
        Integer integer2 = Integer.valueOf(2334);
        Integer a = Integer.valueOf('a');
        System.out.println(integer2);
        System.out.println(a);
    }
}
