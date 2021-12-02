package dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

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


        /*
        练习：获取一个人出生的天数
            1. 通过Scanner类中的方法 next, 获取一个人的出生日期，格式是 字符串
            2. 将字符串转化为 日期格式，使用Dateformate的parse方法
            3. 把日期转换为毫秒值
            4. 获取当前日期并转换为毫秒值
            5. 计算上述2个毫秒值的差值
            6. 将毫秒值转化为 天数
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生日期： yyyy-MM-dd");
        String dateString = scanner.next();
        SimpleDateFormat birthdayFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = birthdayFormat.parse(dateString);
        long birthdayMills = birthday.getTime();
        long currentMills = System.currentTimeMillis();

        long millsDiff = currentMills - birthdayMills;
        System.out.println(millsDiff / 1000 / 3600 / 24);
    }
}
