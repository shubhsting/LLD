package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.COMPOSITE.FILE_SYSTEM_SOLUTION;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        Directory ds = new Directory("op", new ArrayList<>());
        ds.add(new File("test_file"));
        Directory ds1 = new Directory("op2", new ArrayList<>());
        ds1.add(new File("op2_test_file"));
        ds.add(ds1);
        ds.ls();
    }
}
