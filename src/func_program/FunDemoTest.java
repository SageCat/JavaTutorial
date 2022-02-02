package func_program;

import java.util.*;

public class FunDemoTest
{
    public static void main(String[] args)
    {
        new Thread(()->{
            System.out.println("this is a thread");
        }).start();

        ArrayList<Person> strings = new ArrayList<Person>();
        strings.add(new Person("sage", 27));
        strings.add(new Person("tony", 12));
        strings.add(new Person("adel", 53));

//        Collections.sort(strings, new Comparator<Person>()
//        {
//            @Override
//            public int compare(Person o1, Person o2)
//            {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(strings, Comparator.comparingInt(Person::getAge));

        for (Person string : strings)
        {
            System.out.println(string);
        }
    }
}
