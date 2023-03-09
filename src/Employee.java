
import java.util.Objects;

public class Employee {
    private String fullName;
    private int id;

    private static int idCreator;

    public Employee(String fullName) {
        this.fullName = fullName;

    }

    public String getFullName() {
        return fullName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (employee.hashCode() != this.hashCode()) {
            return false;
        }
        return Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        int result1 = fullName == null ? 0 : fullName.hashCode();
        int result = 31 * result1;
        return result;
    }

    @Override
    public String toString() {
        return fullName;
    }
}