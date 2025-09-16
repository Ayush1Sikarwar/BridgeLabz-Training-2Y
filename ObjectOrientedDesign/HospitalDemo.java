import java.util.*;

class Patient {
    String name;
    Patient(String n) { name = n; }
}

class Doctor {
    String name;
    Doctor(String n) { name = n; }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " consults Patient " + p.name);
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String n) { name = n; }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Adams");
        Doctor d2 = new Doctor("Dr. Kelly");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p2);
        d1.consult(p2);
    }
}

