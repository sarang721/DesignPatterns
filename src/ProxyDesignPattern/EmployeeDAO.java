package ProxyDesignPattern;

public interface EmployeeDAO {

    public void create(String client, String employeeId);
    public void delete(String client, String employeeId);
    public void get(String client, String employeeId);

}
