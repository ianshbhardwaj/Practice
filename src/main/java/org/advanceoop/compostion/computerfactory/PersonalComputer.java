package org.advanceoop.compostion.computerfactory;

public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;



    public PersonalComputer(String model, String manufacturing, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturing);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    private void drawlogo()
    {
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp()
    {
        computerCase.pressPowerButton();
    }

    //Getter Methods for Attributes

//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }


}
