package org.opp.StringFormatting3;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate ="02/02/2000";
        int strtingIndex = birthDate.indexOf("2");
        System.out.println("StartingIndex = " + strtingIndex);
        System.out.println("Birth Year = " +birthDate.substring(strtingIndex));

        System.out.println("Month = "+ birthDate.substring(3,5));

        String newDate = String.join("/", "25","11","1982");

        System.out.println("newDate = " + newDate );

        newDate = "20";
        newDate =  newDate.concat("/");
        newDate =  newDate.concat("12");
        newDate =  newDate.concat("/");
        newDate =  newDate.concat("1976");
        System.out.println("newDate = "+ newDate);

        newDate = "25"+"/"+"11"+"/"+"1992";
        System.out.println("newDate = "+newDate);


        newDate = "20".concat("/").concat("01").concat("/").concat("1945");
        System.out.println("newDate = "+newDate);


        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replace("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

    }
}
