package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author g84196891
 */
public class CollectionBasic
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArrayList = new ArrayList<>();
        HashSet<String> stringHashSet = new HashSet<>();

        stringArrayList.add("sage");
        stringArrayList.add("sage1");
        stringArrayList.add("sage2");
        stringArrayList.add("sage3");
        stringHashSet.add("sss");

        for (String s : stringArrayList)
        {
            System.out.println(s);
        }

        System.out.println("===================");

        for (String s : stringArrayList)
        {
            System.out.println(s);
        }

        Iterator<String> iterator = stringArrayList.iterator();
        while (iterator.hasNext())
        {
            String next = iterator.next();
            if("sage2".equals(next))
            {
                iterator.remove();
            }
            System.out.println(next);
        }
    }
}
