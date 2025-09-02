import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number n: ");
            int n = sc.nextInt();

            if (n > 0) {
                // Using formula
                int sumFormula = n * (n + 1) / 2;

                // Using for loop
                int sumLoop = 0;
                for (int i = 1; i <= n; i++) {
                    sumLoop += i;
                }

                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using for loop: " + sumLoop);

                if (sumFormula == sumLoop) {
                    System.out.println("Both results are correct and equal.");
                } else {
                    System.out.println("Mismatch in results!");
                }
            } else {
                System.out.println("The number " + n + " is not a natural number.");
            }
        }
    }
}
