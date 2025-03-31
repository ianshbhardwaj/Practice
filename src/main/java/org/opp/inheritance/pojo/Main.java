package org.opp.inheritance.pojo;

public class Main {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            LPAStudent s = new LPAStudent("S92300"+i,
                    switch(i)
                    {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 ->"Lisa";
                default->"Anonymous";
                }, "05/11/1985", "JavaMster");

            System.out.println(s);
        }


        Student pojoStudent = new Student("S293006","Ramu","05/11/1985", "JavaMasterClass");
        LPAStudent recordStudent = new LPAStudent("S293007","Bill","09/11/1990", "JavaMasterClass");


       System.out.println("****************");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        System.out.println("****************");



        System.out.println(pojoStudent.getName()+" is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking " + recordStudent.classList());



    }
}
