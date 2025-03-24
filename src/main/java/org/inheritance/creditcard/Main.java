package org.inheritance.creditcard;

public class Main {
    public static void main(String[] args) {
        Customer roger=new Customer("paras",6700.00, "paras@gmail.com");
        Customer cibc= new Customer();
        Customer rbc= new Customer("aqib", "aqib@gmail.com");
        System.out.println(roger.getcredit());
        System.out.println(roger.getname());
        System.out.println(roger.getemail());

        System.out.println("\n\n");

        System.out.println(cibc.getcredit());
        System.out.println(cibc.getname());
        System.out.println(cibc.getemail());


        System.out.println("\n\n");

        System.out.println(rbc.getcredit());
        System.out.println(rbc.getname());
        System.out.println(rbc.getemail());




        System.out.println();
    }
}
