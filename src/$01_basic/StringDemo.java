package $01_basic;

public class StringDemo
{
    public static void main(String[] args)
    {
        learnStringBuilder();

    }

    private static void learnStringBuilder()
    {
        /*
        字符串缓冲区，避免String类频繁创建新的对象，以此来提高效率
        构造方法：
            1. 空参：默认创建一个容量为16的对象，若超出长度，则自动扩容
            2.
         */

        StringBuilder emptyStringBuilder = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder("abc");

        System.out.println("empty: " + emptyStringBuilder);
        System.out.println(stringBuilder);

        /*调用 toString 方法将 字符串缓冲区对象转化为 String 对象*/
        String string = stringBuilder.toString();
        System.out.println(string);
    }
}
