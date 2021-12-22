package linktables;


public class LinkedListDemo
{
    private Node head;
    private int size;

    static class Node
    {
        Object data;
        Node next;

        public Node(Object data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void printOutList(LinkedListDemo list)
    {
        Node currentNode = list.head;
        while (currentNode != null)
        {
            System.out.print(currentNode.data);
            System.out.print(" -> ");
            currentNode = currentNode.next;
        }
    }

    public LinkedListDemo insert(Object data)
    {
        Node newNode = new Node(data);
        newNode.next = null;

        if (this.head == null)
        {
            this.head = newNode;
            this.size++;
        }
        else
        {
            Node last = this.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = newNode;
            this.size++;
        }
        return this;
    }

    public int getSize()
    {
        return size;
    }
}
