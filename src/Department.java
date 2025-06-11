import java.util.Objects;

public class Department {
    private String department;

    public Department(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(department);
    }

    @Override
    public String toString() {
        return "Отдел " + department;
    }
}
