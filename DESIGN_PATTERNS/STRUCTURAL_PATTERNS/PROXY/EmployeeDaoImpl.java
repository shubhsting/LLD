package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.PROXY;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, Employee employee) {
        System.out.println("created employee with name" + employee.name);
    }

    @Override
    public void get(String client, int employeeId) {
        System.out.println("fetched employee with id" + employeeId);
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("deleted employee with id" + employeeId);
    }
}
