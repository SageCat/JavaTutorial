package $04_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LearnArrayList
{
    public static void main(String[] args)
    {
        List arrayList = new ArrayList();

        arrayList.add("sage1");
        arrayList.add("sage2");
        arrayList.add("sage3");
        arrayList.add("sage4");
        arrayList.add("sage5");

        for (int i = 0; i < arrayList.size(); i++)
        {
            Object next = arrayList.get(i);
            if (next == "sage3")
            {
                arrayList.add("sage6");
            }
            else {
                System.out.println(next);
            }

        }
        System.out.println(arrayList);

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext())
        {
            Object next = listIterator.next();
            if (next == "sage3")
            {
                listIterator.add("sage6");
            }
            else {
                System.out.println(next);
            }
        }
        System.out.println(arrayList);


        new ArrayList<Integer>()

        /*
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
        System.out.println("耗时2：" + (end - start));*/
    }
}
