package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.PROXY;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDaoImpl impl;

    EmployeeDaoProxy() {
        this.impl = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) {
        if ("ADMIN".equals(client)) {
            impl.create(client, employee);
            return;
        }
        throw new UnsupportedOperationException("not supported operation");
    }

    @Override
    public void get(String client, int employeeId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void delete(String client, int employeeId) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
