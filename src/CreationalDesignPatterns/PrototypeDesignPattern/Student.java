package CreationalDesignPatterns.PrototypeDesignPattern;

public class Student implements Prototype{

    String name;
    int rollNumber;
    int age;
    Student(String name, int rollNumber, int age)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(name, rollNumber, age);
    }
}
