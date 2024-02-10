package FacadeDesignPattern;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;
    public EmployeeFacade()
    {
        employeeDAO = new EmployeeDAO();
    }
    public void insert()
    {
        employeeDAO.insert();
    }
    public void getEmployeeDetails()
    {
        employeeDAO.getEmployeeDetails("test");
    }

}
