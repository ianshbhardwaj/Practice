package org.advanceoop.compostion.computerfactory;

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "dell", "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 X 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);



//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
