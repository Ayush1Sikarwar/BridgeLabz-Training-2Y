public class Convert_Kilometers_to_Miles {
    // Convert kilometers to miles
    public static double convertToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = convertToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        scanner.close();
    }
}
