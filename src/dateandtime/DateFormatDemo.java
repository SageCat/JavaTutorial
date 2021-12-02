package dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo
{
    public static void main(String[] args) throws ParseException
    {
        /*
        获取当前日期和时间
         */
        Date currentDate = new Date();
        System.out.println(currentDate);

        /*
        创建一个 SimpleDateFormat 对象，并指明相应格式
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        /*
        调佣 format 方法，将当前日期和时间 转化为 simpleDateFormat 对象中指定的 日期格式字符串
         */
        String currentDateString = simpleDateFormat.format(currentDate);
        System.out.println(currentDateString);

        /*
        调用 parse 方法，将符合SimpleDateFormat对象中指定格式的字符串转换为 日期对象
         */
        Date dateOfString = simpleDateFormat.parse("2021-11-22");
        System.out.println(dateOfString);
    }
}
