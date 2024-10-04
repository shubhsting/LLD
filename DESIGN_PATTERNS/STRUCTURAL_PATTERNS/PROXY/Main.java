package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.PROXY;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .withAddress("hello")
                .withName("shubham")
                .withAge(34)
                .build();

        EmployeeDaoProxy proxy = new EmployeeDaoProxy();
        proxy.create("ADMIN", employee);
    }
}
