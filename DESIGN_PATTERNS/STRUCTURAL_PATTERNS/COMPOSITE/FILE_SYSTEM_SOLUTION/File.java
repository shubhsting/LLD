package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.FILE_SYSTEM_SOLUTION;

public class File implements FileSystem {

    public String fileName;

    File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File Name is: " + fileName);
    }
}
