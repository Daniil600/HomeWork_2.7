import java.util.Map;
import java.util.TreeMap;

public class EmployeeBook {

    Map<Integer, Employee> employeeMap = new TreeMap<>();
    private int id;
    private static int idCreator;

    public void addEmployee(String fullName) {
        Employee employee = new Employee(fullName);
        id = idCreator++;
        employeeMap.put(id, employee);
    }

    public void removeEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Удаление выполнено");
        }
    }

    public String findEmployeeId(int id) {
        if (employeeMap.containsKey(id)) {
            return employeeMap.get(id).toString();
        } else {
            return "Не найден";
        }
    }

    public String findEmployeeName(String fullName) {
        Employee employee = new Employee(fullName);

        if (employeeMap.containsValue(employee)) {
            return employee.toString();
        }
        return "Не нейден";
    }

    public void showAll() {
        System.out.println(employeeMap);
    }
}
