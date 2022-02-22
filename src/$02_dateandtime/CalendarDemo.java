package $02_dateandtime;

import java.util.Calendar;

public class CalendarDemo
{
    public static void main(String[] args)
    {
        /*
        Calendar 代替了 Date 类中的很多功能
        Calendar 是一个抽象类，提供了很多操作日历字段的方法
        由于是抽象类，无法直接创建对象，可以通过 getInstance 获取一个 Calendar的子类GregorianCalendar对象
         */
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        /*
        常用成员方法：
        1. get(int type) 获取方法，可获取年份，月份，周等等
        2. set(int type) 获取方法，可获取年份，月份，周等等
        3. add(int type) 计算 年月日偏移量等等
        4. getTime() 把 Calendar对象转换为Date对象
         */

        // 获取年份
        System.out.println(instance.get(Calendar.YEAR));
        // 获取月份
        System.out.println(instance.get(Calendar.MONTH)+1);

        // 获取当月的第几天
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        // 获取24小时制 的几点
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));
        // 获取12小时制 的几点
        System.out.println(instance.get(Calendar.HOUR));
    }
}
