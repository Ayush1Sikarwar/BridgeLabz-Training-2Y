public class Power_Calculation {
    // Calculate power using Math.pow
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = calculatePower(base, exponent);
        if (result == (int) result) {
            System.out.println(base + " raised to the power of " + exponent + " is: " + (int) result);
        } else {
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
        scanner.close();
    }
}
