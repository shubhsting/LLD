package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.PROXY;

public interface EmployeeDao {
    void create(String client, Employee employee);

    void get(String client, int employeeId);

    void delete(String client, int employeeId);
}
