package org.opp.inheritance.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porshe");
       // car.setMake("Meserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = "+car.getMake());
        System.out.println("model = "+car.getModel());
        car.describeCar();
        }
    }
