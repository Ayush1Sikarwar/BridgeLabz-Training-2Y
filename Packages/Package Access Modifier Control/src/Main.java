import access.one.Base;
import access.two.Derived;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Access Modifier Demo ===");

        Base base = new Base();
        base.publicMethod();  
        System.out.println("--------------------------------");
        Derived d = new Derived();
        d.accessTest();       
    }
}
