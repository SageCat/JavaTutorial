package $11_reflection;

import java.lang.annotation.*;

public class AnnotationTest
{
    public static void main(String[] args)
    {
        Class<AnnoTest> annoTestClass = AnnoTest.class;
        Annotation[] annotations = annoTestClass.getAnnotations();
        for (Annotation annotation : annotations)
        {
            System.out.println(annotation);
        }

        Annotation[] declaredAnnotations = annoTestClass.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations)
        {
            System.out.println(declaredAnnotation);
        }
    }
}

@MyAnno("hello")
class AnnoTest
{
    @FieldAnno(columnID = 1, columnName = "age", columnType = "int")
    private int age;
    @FieldAnno(columnID = 1, columnName = "name", columnType = "varchar")
    private String name;
    @FieldAnno(columnID = 1, columnName = "address", columnType = "varchar")
    private String address;
}

/**
 * @author g84196891
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
    String value();
}

/**
 * @author g84196891
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldAnno
{
    int columnID();

    String columnName();

    String columnType();
}
