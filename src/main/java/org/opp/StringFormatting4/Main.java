package org.opp.StringFormatting4;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello"+" World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");
        helloWorldBuilder.append(" and Goodbye");


        printinformation(helloWorld);
        printinformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printinformation(emptyStart);
        printinformation(emptyStart32);



    }
    public static void printinformation(String string)
    {
        System.out.println("String = "+string);
        System.out.println("Length = "+string.length());
    }
    public static void printinformation(StringBuilder builder)
    {
        System.out.println("StringBuilder = "+builder);
        System.out.println("StringBuilder = "+builder.length());
        System.out.println("capacity = "+builder.capacity());
    }
}
