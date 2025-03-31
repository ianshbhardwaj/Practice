package org.opp.StringFormatting;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:"+"\n\u2022 First Point"+"\n\u2022 Second Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                \u2022First Point
                 \u2022Second Point """;

        System.out.println(textBlock);


        int age =25;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (double)age);

        for(int i=1;i<=10000;i=i*10)
        {
            System.out.printf("Prnting %6d %n", i);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);
        

    }
}
