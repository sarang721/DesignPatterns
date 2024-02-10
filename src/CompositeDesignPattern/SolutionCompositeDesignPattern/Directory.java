package CompositeDesignPattern.SolutionCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> objects;
    public Directory(String directoryName)
    {
        this.directoryName = directoryName;
        objects = new ArrayList<>();
    }
    public void add(FileSystem obj)
    {
        objects.add(obj);
    }
    @Override
    public void ls() {
        System.out.println("Directory is "+directoryName);
        for(FileSystem obj :objects)
        {
            obj.ls();
        }
    }
}
