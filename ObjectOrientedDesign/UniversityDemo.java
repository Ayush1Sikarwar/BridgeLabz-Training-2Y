import java.util.*;

class Faculty {
    String name;
    Faculty(String n) { name = n; }
    void show() { System.out.println("Faculty: " + name); }
}

class Department {
    String name;
    Department(String n) { name = n; }
    void show() { System.out.println("Department: " + name); }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String n) { name = n; }

    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }

    void showUniversity() {
        System.out.println("University: " + name);
        for (Department d : departments) d.show();
        for (Faculty f : faculties) f.show();
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University u = new University("Oxford");

        u.addDepartment(new Department("Computer Science"));
        u.addDepartment(new Department("Physics"));

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Brown");
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showUniversity();
    }
}
