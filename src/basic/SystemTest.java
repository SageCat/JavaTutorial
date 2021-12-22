package basic;

public class SystemTest
{
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 99999; i++)
        {

        }
        System.out.println();
        System.out.println(System.currentTimeMillis());

        /*
        数组复制
         */
        learnArrayCopy();
    }

    /* 数组复制 */
    private static void learnArrayCopy()
    {
        int[] src = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] dest = {11, 12, 13, 14, 15, 16, 17, 18, 19};

        System.arraycopy(src, 0, dest, 0,src.length);
        System.out.println(src);
    }

}
