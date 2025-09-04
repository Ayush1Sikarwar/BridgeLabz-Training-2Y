import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive number: ");
            int n = sc.nextInt();

            String[] results = new String[n];

            for (int i = 1; i <= n; i++) {
                if (i % 15 == 0) results[i - 1] = "FizzBuzz";
                else if (i % 3 == 0) results[i - 1] = "Fizz";
                else if (i % 5 == 0) results[i - 1] = "Buzz";
                else results[i - 1] = String.valueOf(i);
            }

            for (int i = 0; i < n; i++) {
                System.out.println("Position " + (i + 1) + " = " + results[i]);
            }
        }
    }
}
