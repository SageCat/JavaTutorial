package $06_generic;

/** 泛型接口第二种实现类，不指明接口的泛型类型
 * @author g84196891*/
public class GenericInterfaceImpl2<I> implements GenericInterface<I>
{
    @Override
    public void method(I i)
    {
        System.out.println(i);
    }
}
