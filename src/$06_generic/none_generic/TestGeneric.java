package $06_generic.none_generic;

public class TestGeneric
{
    public static void main(String[] args)
    {
        PrintInteger printInteger = new PrintInteger(20);
        printInteger.printInfo();

        PrintString printString = new PrintString("Sage");
        printInteger.printInfo();
    }
}
