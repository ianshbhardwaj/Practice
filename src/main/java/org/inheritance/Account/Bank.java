package org.inheritance.Account;

public class Bank {
    private int accountno;
    private double balance;
    private String custname;
    private String email;
    private int phone;


    public Bank()
    {
        System.out.println("Empty Constructor called");
    }

//Constructor Don't need setter
    public Bank(int accountno, double balance, String custname, String customeremail, int costomerphone)
    {
        System.out.println("Account constructor with parameter called");
        this.accountno= this.accountno;
        this.balance=balance;
        this.custname=custname;
        email = customeremail;
        phone=costomerphone;
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

    public void setAccountno(int accountno)
    {
        this.accountno=accountno;
    }

    public String getCustname()
    {
        return custname;
    }

    public void setCustname(String custname)
    {
        this.custname=custname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


}
