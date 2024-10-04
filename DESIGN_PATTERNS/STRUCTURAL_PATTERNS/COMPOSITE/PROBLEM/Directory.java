package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.PROBLEM;

import java.util.List;

public class Directory {
    String name;
    List<Object> objectList;

    public Directory(String name, List<Object> objectList) {
        this.name = name;
        this.objectList = objectList;
    }

    public void add(Object obj) {
        objectList.add(obj);
    }

    public void ls() {
        System.out.println("directory_detected: " + name);
        for (Object obj : objectList) {
            if (obj instanceof File)
                ((File) obj).ls();
            else if (obj instanceof Directory)
                ((Directory) obj).ls();
        }
    }
}
