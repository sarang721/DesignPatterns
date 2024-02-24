package CreationalDesignPatterns.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    abstract public void setSubjects();
    public Student build() {
        return new Student(this);
    }


}
