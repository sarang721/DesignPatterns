package ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void create(String client, String employeeId) {
        System.out.println("Employee created with id "+employeeId);
    }
    @Override
    public void delete(String client, String employeeId) {
        System.out.println("Employee deleted with id "+employeeId);
    }
    @Override
    public void get(String client,String employeeId) {
        System.out.println("Employee details fetched with id "+employeeId);
    }
}
