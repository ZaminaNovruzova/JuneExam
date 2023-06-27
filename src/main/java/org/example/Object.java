package org.example;

public class Object {
    private  final int id;
    private  final String name;
    private  final String lastName;
    private  final String fatherName;
    private   final int age;

    public Object(int id, String name, String lastName, String fatherName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                '}';
    }
}
