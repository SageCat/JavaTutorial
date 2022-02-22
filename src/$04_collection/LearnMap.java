package $04_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map<K, V>集合特点：
 *  1. Map是一个双列集合，一个元素包含key和value
 *  2. Map集合中，key和value的数据类型可以相同，也可以不同
 *  3. Map集合中，key不可以重复，但是value可以重复
 *  4. Map集合中，key和value是一一对应的关系
 * Map<K, V>常用子类
 *  1. HashMap<K, V>，底层是哈希表，查询速度很快，是无序集合，不保证顺序，且是不同步的
 *      - LinkedHashMap<K, V>：有可预支的迭代顺序
 * @author g84196891
 */

public class LearnMap
{
    public static void main(String[] args)
    {
        addElement();
        System.out.println("=============================");
        removeElement();
        System.out.println("=============================");
        getElement();
    }

    private static void getElement()
    {
        HashMap<Object, Integer> objectIntegerHashMap = new HashMap<>(10);
        objectIntegerHashMap.put("Math", 120);
        objectIntegerHashMap.put("Chinese", 100);
        objectIntegerHashMap.put("English", 100);
        /*获取所有key*/
        Set<Object> objects = objectIntegerHashMap.keySet();
        System.out.println(objects);
        /*获取所有value*/
        Collection<Integer> values = objectIntegerHashMap.values();
        System.out.println(values);
        for (Object object : objects)
        {
            /*是否包含指定key*/
            System.out.print(objectIntegerHashMap.containsKey(object) + "\t");
            /*通过key获取到value*/
            System.out.println(object + " ---> " + objectIntegerHashMap.get(object));
        }
        /*若key不存在，则返回null*/
        System.out.println(objectIntegerHashMap.get("History"));
        /*是否包含指定key*/
        System.out.println(objectIntegerHashMap.containsKey("History"));

        System.out.println("----------------------------------------");
        /**
         * 第2种遍历方法：Map.Entry
         */
        Set<Map.Entry<Object, Integer>> entries = objectIntegerHashMap.entrySet();
        for (Map.Entry<Object, Integer> entry : entries)
        {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
    }

    private static void removeElement()
    {
        HashMap<Object, Integer> objectIntegerHashMap = new HashMap<>();
        objectIntegerHashMap.put("Math", 120);
        objectIntegerHashMap.put("Chinese", 100);
        objectIntegerHashMap.put("English", 110);

        System.out.println(objectIntegerHashMap);

        /*返回被删除的value，若键存在，则返回被删除的value，若键不存在，则返回null*/
        System.out.println(objectIntegerHashMap.remove("English"));
        System.out.println(objectIntegerHashMap.remove("History"));

        System.out.println(objectIntegerHashMap);
    }

    private static void addElement()
    {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("三国演义", "罗贯中");
        objectObjectHashMap.put("红楼梦", "曹雪芹");
        /* 添加两次，但是只存储一次 */
        objectObjectHashMap.put("红楼梦", "曹雪芹");

        for (Object o : objectObjectHashMap.keySet())
        {
            System.out.println(o + " ---> " + objectObjectHashMap.get(o));
        }

        /* 添加一对新的元素，若键不存在，则返回null， 若键存在，则返回被替换的value的值 */
        System.out.println(objectObjectHashMap.put("Sage", 23));
        System.out.println(objectObjectHashMap.put("Sage", 28));
    }
}
