
public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployeesNotInLine();
        System.out.println(employeeBook.addNewEmployee(employeeBook.newEmployee9));
        employeeBook.printAllEmployeesNotInLine();
        System.out.println(employeeBook.addNewEmployee(employeeBook.newEmployee10));
        employeeBook.deleteEmployee(10);
        employeeBook.deleteEmployee(565);
        System.out.println(employeeBook.findEmployee(33));
        System.out.println("Total salary of employees " + employeeBook.sumSalaryAllEmployees());
        employeeBook.printAllEmployeesInLine();
        System.out.println(employeeBook.employeeWithMinSalary());
        System.out.println(employeeBook.employeeWithMaxSalary());
        employeeBook.getFullName();
        System.out.println(employeeBook.averageSalaryDeployee());
        employeeBook.increaseSalaryForAllEmployees(10);
        System.out.println(employeeBook.employeeWithMinSalaryInDepartment(employeeBook.departmentMarketing));
        System.out.println(employeeBook.employeeWithMaxSalaryInDepartment(employeeBook.departmentDevelopment));
        System.out.println(employeeBook.sumSalaryInDepartment(employeeBook.departmentMarketing));
        System.out.println(employeeBook.averageSalaryInDepartment(employeeBook.departmentITSupport));
        employeeBook.indexSalaryInDepartment(employeeBook.departmentDevelopment,55);
        employeeBook.printEmployeesInDepartment(employeeBook.departmentDevelopment);
        employeeBook.indexSalaryEmployee(3, -50);
        System.out.println(employeeBook.employeeWithMinSalaryInDepartment(employeeBook.departmentDevelopment));
        employeeBook.getEmployeesWithSalaryMoreValue(55000);
        employeeBook.getEmployeesWithSalaryLessValue(55000);


    }

}
