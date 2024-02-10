package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {

        EmployeeDAO employeeDAOProxy = new EmployeeDAOProxy();
        employeeDAOProxy.create("CLIENT","tes12");
        employeeDAOProxy.create("ADMIN","test323");
        employeeDAOProxy.delete("ADMIN","test23");
    }
}
