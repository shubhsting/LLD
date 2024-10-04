package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.PROBLEM;

public class File {
    public String fileName;

    File(String fileName) {
        this.fileName = fileName;
    }
    public void ls() {
        System.out.println("File Name is: " + fileName);
    }
}
