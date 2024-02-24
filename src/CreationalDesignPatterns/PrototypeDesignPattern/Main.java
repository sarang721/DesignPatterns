package CreationalDesignPatterns.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Sarang", 12, 22);

        Student studentClone = (Student) student.clone();
        System.out.println(studentClone.name);
    }
}
