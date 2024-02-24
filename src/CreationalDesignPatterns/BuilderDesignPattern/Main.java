package CreationalDesignPatterns.BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

//        StudentBuilder obj = new EngineeringStudentBuilder();
//        obj.setAge(20);
//        obj.setFatherName("acaa");
//        obj.setName("test");
//        obj.setMotherName("test2");
//        obj.setRollNumber(21);
//        obj.setSubjects();
//
//        StudentBuilder obj22 = new MBAStudentBuilder();
//        obj22.setAge(20);
//        obj22.setFatherName("acaa");
//        obj22.setName("test");
//        obj22.setMotherName("test2");
//        obj22.setRollNumber(21);
//        obj22.setSubjects();
//
//        Student obj1 = new Student(obj);
//        Student obj2 = new Student(obj22);
//
//        System.out.println(obj1.toString());
//        System.out.println(obj2.toString());



        Director obj1 = new Director(new EngineeringStudentBuilder());
        Director obj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = obj1.createStudent();
        Student mbaStudent = obj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());



    }
}
