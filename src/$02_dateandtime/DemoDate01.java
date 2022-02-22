package $02_dateandtime;

import java.util.Date;

public class DemoDate01
{
    public static void main(String[] args)
    {
        /*
        1970年1月1日0点至现在的毫秒值
         */
        System.out.println("当前时间的毫秒值：" + System.currentTimeMillis());

        /*
        Date类的空参构造方法，会输出系统当前的日期和时间
         */
        Date date = new Date();
        System.out.println("当前日期：" + date);
        /*
        获取毫秒值，等同于 System.currentTimeMillis()
         */
        System.out.println("当前时间的毫秒值》》》》》》》》》》》》》 "+date.getTime());

        /*
        创建一个 日期对象，并传入 毫秒值，会得到相应的日期和时间
         */
        Date date1 = new Date(163838886811L);
        System.out.println(date1);
    }
}
