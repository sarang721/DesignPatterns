package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public void setSubjects() {
        List<String> subs  = new ArrayList<>();
        subs.add("Maths");
        subs.add("Statistics");
        this.subjects=subs;
    }
}
