import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ApplicationContext applicationContext = new ApplicationContext();
        Employee employee = (Employee) applicationContext.createBean(Employee.class);
        employee.setId(1);
        employee.setName("Kien");
        System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
    }
}
