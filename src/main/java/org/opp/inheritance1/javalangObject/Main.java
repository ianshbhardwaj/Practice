package org.opp.inheritance1.javalangObject;

public class Main extends Object
{
    public static void main(String[] agrs)
    {
        Student max= new Student("Max", 22);
        System.out.println(max.toString());

    }

}


class Student
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

