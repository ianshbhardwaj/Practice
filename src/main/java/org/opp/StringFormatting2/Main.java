package org.opp.StringFormatting2;

public class Main {
    public static void main(String[] args)
    {
        printInformation("Hello World");
        printInformation("\t  \n");

        String helloWorld = "Hello World";
        System.out.println("\n\nHello World");
        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));
        System.out.printf("index of l = %d %n",helloWorld.indexOf('l'));
        System.out.printf("index of l last = %d %n",helloWorld.lastIndexOf('l'));
        System.out.printf("index of W = %d %n",helloWorld.indexOf('W'));
        System.out.printf("index of World = %d %n",helloWorld.indexOf("World"));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower))
        {
            System.out.println("Values Match Exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower))
        {
            System.out.println("Values Match Ignoring Case");
        }

        if(helloWorld.startsWith("Hello"))
        {
            System.out.println("String Start with Hello");
        }
        if(helloWorld.endsWith("World"))
        {
            System.out.println("String End with World");
        }
        if(helloWorld.contains("World"))
        {
            System.out.println("String Contains World");
        }
        if(helloWorld.contentEquals("Hello World"))
        {
            System.out.println("Values Match Exactly");
        }

    }

    public static void printInformation(String string)
    {
        int length = string.length();
        System.out.printf("Length of String = %d %n", length);
        if(string.isEmpty())
        {
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank())
        {
            System.out.println("String is Blank");

            return;
        }
        {

        }
        System.out.printf("First character is = %c %n", string.charAt(0));
        System.out.printf("Last Char is = %c %n", string.charAt(length - 1));



    }
}
