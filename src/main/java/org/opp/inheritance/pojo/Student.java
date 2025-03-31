package org.opp.inheritance.pojo;

public class Student {
    private String id;
    private String name;
    private String dateofBirth;
    private String classList;


    public Student(String id, String name, String dateofBirth, String classList)
    {
        this.id=id;
        this.classList=classList;
        this.dateofBirth=dateofBirth;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
