package CompositeDesignPattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;
    Directory(String directoryName)
    {
        this.directoryName = directoryName;
        objectList = new ArrayList<>();
    }
    public void add(Object object)
    {
        objectList.add(object);
    }
    public void ls()    // problem here is everytime we have to do instance of to check if it
            // is file or directory, so instead we can have a fileSystem interface which is implemented
    // by both Directory and File
    {
        System.out.println("Directory is "+directoryName);
        for(Object obj : objectList)
        {
            if(obj instanceof File) {
                ((File) obj).ls();
            }
            else if(obj instanceof Directory) {

                ((Directory) obj).ls();
            }

        }
    }

}
