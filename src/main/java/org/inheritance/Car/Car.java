package org.inheritance.Car;

public class Car {
    private String make ="Tesla";
    private String model="Model X";
    private String color="Gray";
    private int doors=2;
    private boolean convertible=true;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make)
    {
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();

        switch (lowercaseMake)
        {
            case "holden", "porshe", "tesla" -> this.make = make;
            default->{
                this.make="Unsupported";
            }
        }
        //this.make = make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake()
    {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }



    public void describeCar()
    {
        System.out.println(doors+"-Door "+
                color+" "+
                make+" "+model+" "+(convertible?"Convertible":""));
    }
    }

