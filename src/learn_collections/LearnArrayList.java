package learn_collections;

import java.util.ArrayList;

public class LearnArrayList
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++)
        {
            integers.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时1：" + (end - start));

        start = System.currentTimeMillis();
        ArrayList<Integer> integers2 = new ArrayList<>(10000000);
        for (int i = 0; i < 10000000; i++)
        {
            integers2.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("耗时2：" + (end - start));
    }
}
