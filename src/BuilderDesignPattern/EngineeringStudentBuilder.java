package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public void setSubjects() {
        List<String> subs  = new ArrayList<>();
        subs.add("OOPS");
        subs.add("DBMS");
        this.subjects=subs;
    }
}
