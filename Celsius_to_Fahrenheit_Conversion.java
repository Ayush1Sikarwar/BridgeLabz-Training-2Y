public class Celsius_to_Fahrenheit_Conversion {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            double f = celsiusToFahrenheit(c);
            System.out.printf("%.2f°C is equal to %.2f°F%n", c, f);
        }
    }
}