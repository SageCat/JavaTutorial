package $06_generic;

/**
 * @author g84196891
 */
public class GenericClass<E>
{
    private E value;

    public GenericClass(E value)
    {
        this.value = value;
    }

    public GenericClass()
    {
    }

    public E getValue()
    {
        return value;
    }

    public void setValue(E value)
    {
        this.value = value;
    }
}
