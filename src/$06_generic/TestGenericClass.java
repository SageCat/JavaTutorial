package $06_generic;

public class TestGenericClass
{
    public static void main(String[] args)
    {
        PrintInformation<String> stringPrintInformation = new PrintInformation<>("Sage");
        stringPrintInformation.printInfo();

        PrintInformation<Integer> integerPrintInformation = new PrintInformation<>(100);
        integerPrintInformation.printInfo();
    }
}
