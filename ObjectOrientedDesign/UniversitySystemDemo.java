import java.util.*;

class Professor {
    String name;
    Professor(String n) { name = n; }
    void assignCourse(Course c) {
        System.out.println("Professor " + name + " teaches " + c.name);
        c.professor = this;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String n) { name = n; }

    void enrollCourse(Course c) {
        courses.add(c);
        c.students.add(this);
        System.out.println(name + " enrolled in " + c.name);
    }
}

class Course {
    String name;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String n) { name = n; }
}

public class UniversitySystemDemo {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Allen");
        Student s1 = new Student("John");
        Student s2 = new Student("Sophie");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Algorithms");

        prof1.assignCourse(c1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);
    }
}
