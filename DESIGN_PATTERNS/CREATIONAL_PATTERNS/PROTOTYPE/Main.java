package DESIGN_PATTERNS.CREATIONAL_PATTERNS.PROTOTYPE;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student("Shubham", 12, "9090909090", "test address");
        System.out.println(((Student)obj.clone()).name);
    }
}
