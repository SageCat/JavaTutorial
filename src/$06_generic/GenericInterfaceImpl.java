package $06_generic;

/** 泛型接口第一种实现类，指明接口的泛型类型 */
public class GenericInterfaceImpl implements GenericInterface<String>
{

    @Override
    public void method(String s)
    {
        System.out.println(s);
    }
}
