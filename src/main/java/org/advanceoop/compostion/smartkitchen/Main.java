package org.advanceoop.compostion.smartkitchen;

public class Main {
    public static void main(String[] args)
    {
        SmartKitchen kitchen = new SmartKitchen();


        kitchen.getDishwasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getDishwasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();


    }
}
