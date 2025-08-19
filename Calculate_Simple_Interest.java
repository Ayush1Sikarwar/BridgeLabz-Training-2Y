import java.util.Scanner;

public class Calculate_Simple_Interest {
    // Calculate simple interest given principal, annual rate (percent) and time (years)
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The simple interest for a principal of " + principal + ", rate of " + rate + "%, and time of " + time + " years is: " + simpleInterest);
        sc.close();
    }
}
