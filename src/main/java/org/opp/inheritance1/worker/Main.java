package org.opp.inheritance1.worker;

public class Main {
    public static void main(String[] args)
    {
        Employee ansh = new Employee("Ansh","02/02/2000", "01/01/2020");
        System.out.println(ansh);
        System.out.println("Age :"+ansh.getAge());
        System.out.println("Age :"+ansh.collectPay());

        SalariedEmployee ram = new SalariedEmployee("Ram","02/02/2000", "01/01/2020", 350000);
        System.out.println(ram);
        System.out.println("Ram's Paycheck = $"+ram.collectPay());

        ram.retie();
        System.out.println("Ram's Pension check = $"+ram.collectPay());

        HourlyEmployee jojo = new HourlyEmployee("Jojo", "01/01/1984", "01/01/2018", 24);
        System.out.println(jojo);
        System.out.println("Jojo's Paycheck = $"+jojo.collectPay());
        System.out.println("Jojo's Holiday Pay = $"+jojo.getDoublePay());

    }
}
