package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.FILE_SYSTEM_SOLUTION;

import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList;

    Directory(String directoryName, List<FileSystem> fileSystemList) {
        this.directoryName = directoryName;
        this.fileSystemList = fileSystemList;
    }

    public void add(FileSystem fs) {
        fileSystemList.add(fs);
    }

    @Override
    public void ls() {
        System.out.println("directory_detected: " + directoryName);
        for (FileSystem fs : fileSystemList)
            fs.ls();
    }

}
