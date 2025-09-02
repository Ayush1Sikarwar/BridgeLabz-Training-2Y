import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number n: ");
            int n = sc.nextInt();

            if (n > 0) {
                // Using formula
                int sumFormula = n * (n + 1) / 2;

                // Using while loop
                int sumLoop = 0;
                int i = 1;
                while (i <= n) {
                    sumLoop += i;
                    i++;
                }

                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using while loop: " + sumLoop);

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
