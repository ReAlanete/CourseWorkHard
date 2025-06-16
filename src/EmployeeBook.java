import java.util.Arrays;

public class EmployeeBook {
    public Department departmentDevelopment = new Department("Разработчиков");
    public Department departmentAnalytics = new Department("Аналитиков");
    public Department departmentAccounting = new Department("Бухгалтерии");
    public Department departmentMarketing = new Department("Маркетинга");
    public Department departmentITSupport = new Department("IT-поддержки");

    public FullName employee1 = new FullName("Аркадий", "Эдуардович", "Гопнец");
    public FullName employee2 = new FullName("Анна", "Игоревна", "Семёнова");
    public FullName employee3 = new FullName("Дмитрий", "Александрович", "Ковалёв");
    public FullName employee4 = new FullName("Елена", "Викторовна", "Петрова");
    public FullName employee5 = new FullName("Максим", "Сергеевич", "Морозов");
    public FullName employee6 = new FullName("Светлана", "Павловна", "Николаева");
    public FullName employee7 = new FullName("Александр", "Геннадьевич", "Смирнов");
    public FullName employee8 = new FullName("Ольга", "Владимировна", "Васильева");
    public FullName employee9 = new FullName("Андрей", "Константинович", "Зотов");
    public FullName employee10 = new FullName("Юлия", "Антоновна", "Кузнецова");
    public FullName employee11 = new FullName("Паша", "Мариявна", "Кукшина");

    private final Employee[] employees = new Employee[10];

    Employee newEmployee = new Employee(departmentMarketing, employee5, 45488);
    Employee newEmployee1 = new Employee(departmentMarketing, employee11, 99999);
    Employee newEmployee2 = new Employee(departmentDevelopment, employee1, 50000.36);
    Employee newEmployee3 = new Employee(departmentAnalytics, employee2, 55000.39);
    Employee newEmployee4 = new Employee(departmentAccounting, employee3, 30000.00);
    Employee newEmployee5 = new Employee(departmentMarketing, employee4, 65000.90);
    Employee newEmployee6 = new Employee(departmentITSupport, employee10, 75000.33);
    Employee newEmployee7 = new Employee(departmentDevelopment, employee6, 72000.12);
    Employee newEmployee8 = new Employee(departmentAnalytics, employee7, 58000.05);
    Employee newEmployee9 = new Employee(departmentAccounting, employee8, 62000.23);
    Employee newEmployee10 = new Employee(departmentMarketing, employee9, 64000.35);

    public EmployeeBook() {
        employees[0] = newEmployee;
        employees[1] = newEmployee1;
        employees[2] = newEmployee2;
        employees[3] = newEmployee3;
        employees[4] = newEmployee4;
        employees[5] = newEmployee5;
        employees[6] = newEmployee6;
        employees[7] = newEmployee7;
        employees[8] = newEmployee8;
    }

    public double parseAndRoundSalary(double value) {
        String formattedValue = String.format("%.2f", value);

        formattedValue = formattedValue.replace(',', '.');
        return Double.parseDouble(formattedValue);
    }


    public double sumSalaryAllEmployees() {
        if (employees.length == 0) {
            return 0;
        }
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return parseAndRoundSalary(total);

    }

    public void printAllEmployeesInLine() {
        System.out.println(Arrays.toString(employees));
    }

    public void printAllEmployeesNotInLine() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Employee employeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary())) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee employeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public void getFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public double averageSalaryDeployee() {
        int counterEmployees = 0;
        double totalSalary = 0;
        double averageSalaryEmployee;
        if (employees == null || employees.length == 0) {
            return 0;
        }
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                counterEmployees++;
            }
        }
        averageSalaryEmployee = totalSalary / counterEmployees;
        return parseAndRoundSalary(averageSalaryEmployee);
    }

    public void increaseSalaryForAllEmployees(double percent) {
        for (Employee employee : employees) {

            double increaseSalary;
            if (employee != null) {
                increaseSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(parseAndRoundSalary(increaseSalary));
            }
        }
    }

    public Employee employeeWithMinSalaryInDepartment(Department department) {

        Employee employeeWithMinSalaryI = null;


        for (Employee employee : employees) {
            if (employee != null) {
                boolean departmentsAreEquals = employee.getDepartment().equals(department);


                if (departmentsAreEquals && (employeeWithMinSalaryI == null || employee.getSalary() < employeeWithMinSalaryI.getSalary())) {
                    employeeWithMinSalaryI = employee;
                }
            }
        }
        return employeeWithMinSalaryI;
    }

    public Employee employeeWithMaxSalaryInDepartment(Department department) {

        Employee employeeWithMaxSalaryI = null;


        for (Employee employee : employees) {
            if (employee != null) {
                boolean departmentsAreEquals = employee.getDepartment().equals(department);


                if (departmentsAreEquals && (employeeWithMaxSalaryI == null || employee.getSalary() > employeeWithMaxSalaryI.getSalary())) {
                    employeeWithMaxSalaryI = employee;
                }
            }
        }
        return employeeWithMaxSalaryI;
    }

    public double sumSalaryInDepartment(Department department) {

        double total = 0;


        for (Employee employee : employees) {
            if (employee != null) {
                boolean departmentsAreEquals = employee.getDepartment().equals(department);
                if (departmentsAreEquals) {
                    total += employee.getSalary();
                }
            }
        }
        return parseAndRoundSalary(total);
    }

    public double averageSalaryInDepartment(Department department) {
        double total = 0;
        double counterEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                boolean departmentsAreEquals = employee.getDepartment().equals(department);
                if (departmentsAreEquals) {
                    total += employee.getSalary();
                    counterEmployees++;
                }
            }
        }
        return parseAndRoundSalary(total / counterEmployees);
    }

    public void indexSalaryInDepartment(Department department, double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment().equals(department)) {
                    employee.setSalary(parseAndRoundSalary(employee.getSalary() * (1 + percent / 100)));
                }
            }
        }
    }

    public void printEmployeesInDepartment(Department department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment().equals(department)) {
                    System.out.println("ID: " + employee.getId() + ". Fullname: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
                }
            }
        }
    }

    public void indexSalaryEmployee(int id, double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getId() == id) {
                    employee.setSalary(employee.getSalary() * (1 + percent / 100));
                }
            }
        }
    }

    public void getEmployeesWithSalaryMoreValue(double value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= value) {
                System.out.println("ID: " + employee.getId() + ". Fullname: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void getEmployeesWithSalaryLessValue(double value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < value) {
                System.out.println("ID: " + employee.getId() + ". Fullname: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public boolean addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(newEmployee)) {
                throw new IllegalArgumentException("Такой сотрудник уже работает в компании");
            }
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int id) {
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                found = true;
                System.out.println("Employee with id " + id + " deleted");
                break; // Прекращаем поиск после удаления сотрудника
            }
        }
        if (!found) {
            System.out.println("Employee with id " + id + " not found");
        }
    }

    public Employee findEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }
}

