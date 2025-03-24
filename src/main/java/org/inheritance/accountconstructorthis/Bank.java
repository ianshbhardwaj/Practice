package org.inheritance.accountconstructorthis;

public class Bank {
    private int accountno;
    private double balance;
    private String custname;
    private String email;
    private int phone;



    //This Constructor
    public Bank()
    {
        this(3456, 34.44, "paras", "paras@gmail.com", 98765);
        System.out.println("Empty Constructor Called");

    }

//Constructor Don't need setter
    public Bank(int accountno, double balance, String custname, String customeremail, int costomerphone)
    {
        System.out.println("Account constructor with parameter called");
        this.accountno= accountno;
        this.balance=balance;
        this.custname=custname;
        email = customeremail;
        phone=costomerphone;
    }


    public Bank(String custname, String email, int phone)
    {
        this(5678, 654.99, custname, email, phone);
//        this.custname = custname;
//        this.email = email;
//        this.phone = phone;
    }



    public void depositFunds(double depositAmount)
    {
        balance+=depositAmount;
        System.out.println("Deposit of $"+depositAmount+" made. New balance is $"+ this.balance);
    }


    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Fund! you only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }


    public int getccountno()
    {
        return accountno;
    }

//    public void setAccountno(int accountno)
//    {
//        this.accountno=accountno;
//    }

    public String getCustname()
    {
        return custname;
    }

 //   public void setCustname(String custname)
    {
        this.custname=custname;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getEmail() {
        return email;
    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public int getPhone() {
        return phone;
    }

//    public void setPhone(int phone) {
//        this.phone = phone;
//    }


}
