import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km * 1.6;

        System.out.println("The total miles is " + miles + " for the given " + km + " km");
<<<<<<< HEAD
        input.close();
=======
>>>>>>> bc64489e8b4dffd51ef5c6f0380f810c87053caa
    }
}
