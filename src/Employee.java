import java.util.Objects;

public class Employee {
    private final int id;

    private static int counter = 0;
    private Department department;
    private FullName fullName;
    private double salary;



    public int getId() {
        return id;
    }

    public Employee(Department department, FullName fullName, double salary) {
        this.id = ++counter;
        this.department = department;
        this.fullName = fullName;
        this.salary = salary;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID " + id +
                ", Department =" + department +
                ", FullName =" + fullName +
                ", Salary = " + salary ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(department, employee.department) && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, fullName, salary);
    }
}
