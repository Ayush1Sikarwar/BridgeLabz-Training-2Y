import java.util.*;

class Employee {
    String name, role;
    Employee(String n, String r) { name = n; role = r; }

    void show() { System.out.println("Employee: " + name + " (" + role + ")"); }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String n) { name = n; }

    void addEmployee(Employee e) { employees.add(e); }

    void showDept() {
        System.out.println("Department: " + name);
        for (Employee e : employees) e.show();
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    Company(String n) { name = n; }

    void addDepartment(Department d) { departments.add(d); }

    void showCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) d.showDept();
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Alice", "Developer"));
        d1.addEmployee(new Employee("Bob", "Tester"));
        d2.addEmployee(new Employee("Clara", "HR Manager"));

        comp.addDepartment(d1);
        comp.addDepartment(d2);

        comp.showCompany();
    }
}
