package $06_generic;

public class PrintInformation<T>
{
    /*
    当不确定传入什么类型的引用类型数据时，创建一个泛型类，可以接收所有类型的数据
     */
    T value;

    public PrintInformation(T value)
    {
        this.value = value;
    }

    public void printInfo()
    {
        System.out.println("this is the value: " + value);
    }
}
