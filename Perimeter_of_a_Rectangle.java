import java.util.Scanner;

public class Perimeter_of_a_Rectangle {
    // Calculate perimeter of a rectangle given length and width
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        double perimeter = calculatePerimeter(length, width);
        System.out.println("The perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
        sc.close();
    }
}
