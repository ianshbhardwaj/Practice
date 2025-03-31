package org.opp.inheritance.accountconstructorthis;

public class Main {
    public static void main(String[] args)
    {


        // "this" Constructor concept
        Bank bobbank = new Bank();


//
//        //Constructor Don't need setter
//        Bank bobbank = new Bank(652698, 500.00, "Ansh", "ansh@gmail.com", 9899950);
//        System.out.println(bobbank.getCustname());
//        System.out.println(bobbank.getEmail());
//        System.out.println(bobbank.getPhone());
//        System.out.println(bobbank.getBalance());


        //Getter and Setter Way
//        Bank bobbank = new Bank();
//        bobbank.setAccountno(98765765);
//        bobbank.setCustname("Ansh");
//        bobbank.setEmail("anshbhardawj@gmail.com");
//        bobbank.setBalance(300.00);
//        bobbank.setPhone(345678);

        System.out.println("This is Getter and Setter");
        System.out.println(bobbank.getCustname());
        System.out.println(bobbank.getEmail());
        System.out.println(bobbank.getPhone());
        System.out.println(bobbank.getBalance());

        bobbank.withdrawFunds(100.0);
        bobbank.depositFunds(100.0);
        bobbank.withdrawFunds(100.0);
        bobbank.depositFunds(250.0);
        bobbank.withdrawFunds(45.0);
        bobbank.withdrawFunds(450.0);


        Bank anshbank = new Bank("aqib", "aqib@gmail.com", 7654);
        System.out.println("Account Number: "+ anshbank.getccountno()+" Customer Name :"+ anshbank.getCustname());


    }
}
