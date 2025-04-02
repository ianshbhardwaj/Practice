package org.advanceoop.compostion.computerfactory;

public class Product {
    private String model;
    private String manufacturing;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturing) {
        this.model = model;
        this.manufacturing = manufacturing;
    }


}


class Monitor extends Product
{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturing) {
        super(model, manufacturing);
    }

    public Monitor(String model, String manufacturing, int size, String resolution) {
        super(model, manufacturing);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color)
    {
        System.out.println(String.format("Drawing pixel at %d,%d in color %s",x,y,color));
    }
}


class Motherboard extends Product
{
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public Motherboard(String model, String manufacturing) {
        super(model, manufacturing);
    }

    public Motherboard(String model, String manufacturing, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturing);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program "+programName+" is now Loading....");
    }
}


class ComputerCase extends Product
{
    private String powersupply;

    public ComputerCase(String model, String manufacturing) {
        super(model, manufacturing);
    }

    public ComputerCase(String model, String manufacturing, String powersupply) {
        super(model, manufacturing);
        this.powersupply = powersupply;
    }

    public void pressPowerButton()
    {
        System.out.println("Power button pressed");
    }
}


