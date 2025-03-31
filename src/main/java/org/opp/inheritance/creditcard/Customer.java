package org.opp.inheritance.creditcard;

public class Customer {
    private String name;
    private double creditlim;
    private String email;


    public String getname()
    {
        return name;
    }


    public String getemail()
    {
        return email;
    }

    public double getcredit()
    {
        return creditlim;
    }

    public Customer(String name, double creditlim, String email)
    {
        this.name = name;
        this.creditlim = creditlim;
        this.email = email;
    }

    public Customer()
    {
        this("ansh",3900.00, "ansh@gmail.com");
        System.out.println(" This Customer Constructor ");
    }

    public Customer(String name, String email)
    {
        this(name,4000.00,email);
        System.out.println("Set default credit value to 4000.00");
    }

}
