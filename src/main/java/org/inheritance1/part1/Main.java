package org.inheritance1.part1;

public class Main extends Object{
    public static void main(String[] agrs)
    {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");


        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");

        Dog retriver = new Dog("Labrador Retriver", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriver, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2,3);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed)
    {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }

}
