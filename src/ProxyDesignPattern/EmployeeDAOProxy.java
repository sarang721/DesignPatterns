package ProxyDesignPattern;

public class EmployeeDAOProxy implements EmployeeDAO{
    EmployeeDAO employeeDAO;
    public EmployeeDAOProxy()
    {
        employeeDAO = new EmployeeDAOImpl();
    }
    @Override
    public void create(String client, String employeeId) {
        if(client.equals("ADMIN"))
        {
            employeeDAO.create(client,employeeId);
        }
        else {
            System.out.println("Access Denied");
        }
    }

    @Override
    public void delete(String client, String employeeId) {
        if(client.equals("ADMIN"))
        {
            employeeDAO.delete(client,employeeId);
        }
        else {
            System.out.println("Access Denied");
        }
    }

    @Override
    public void get(String client, String employeeId) {
        if(client.equals("ADMIN"))
        {
            employeeDAO.get(client,employeeId);
        }
        else {
            System.out.println("Access Denied");
        }
    }
}
