package $04_collection.linktables;

public class LinkedListDemoTest
{
    public static void main(String[] args)
    {
        LinkedListDemo linkedListDemo = new LinkedListDemo();

        for (int i = 0; i < 1000; i++)
        {
            linkedListDemo.insert(i);
        }

        linkedListDemo.printOutList(linkedListDemo);
        System.out.println();
        System.out.println(linkedListDemo.getSize());
    }
}
