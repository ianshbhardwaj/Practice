package org.StringFormatting2;

public class Main {
    public static void main(String[] args)
    {
        printInformation("Hello World");
    }

    public static void printInformation(String string)
    {
        int length = string.length();
        System.out.printf("Length of String = %d %n", length);
        System.out.printf("First character is = %c %n", string.charAt(0));
        System.out.printf("Last Char is = %c %n", string.charAt(length - 1));


    }
}
