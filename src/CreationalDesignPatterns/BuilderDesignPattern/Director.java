package CreationalDesignPatterns.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;
    Director(StudentBuilder obj)
    {
        this.studentBuilder = obj;
    }

    public Student createStudent()
    {
        if(studentBuilder instanceof EngineeringStudentBuilder)
        {
            return createEngineeringStudent();
        }
        else {
            return createMBAStudent();
        }
    }
    public Student createEngineeringStudent()
    {
        studentBuilder.setAge(20);
        studentBuilder.setFatherName("acaa");
        studentBuilder.setName("test");
        studentBuilder.setMotherName("test2");
        studentBuilder.setRollNumber(21);
        studentBuilder.setSubjects();
        return studentBuilder.build();

    }
    public Student createMBAStudent()
    {
        studentBuilder.setAge(21);
        studentBuilder.setFatherName("hqevdh");
        studentBuilder.setName("whuihr");
        studentBuilder.setMotherName("qwgdq");
        studentBuilder.setRollNumber(29);
        studentBuilder.setSubjects();

        return studentBuilder.build();
    }

}
