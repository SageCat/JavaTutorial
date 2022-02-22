package $05_func_program_lambda;

/**
 * @author g84196891
 */
public class CalculatorTest
{
    public static void main(String[] args)
    {
        invokeAdd(2, 4, (a, b) -> a + b);
    }

    private static void invokeAdd(int a, int b, Calculator calculator)
    {
        System.out.println(calculator.add(a, b));
    }
}
