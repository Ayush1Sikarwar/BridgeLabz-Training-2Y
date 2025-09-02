import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a positive integer (less than 100): ");
            int number = sc.nextInt();

            if (number <= 0 || number >= 100) {
                System.out.println("Number must be positive and less than 100.");
                return;
            }

            int counter = number - 1;

            System.out.println("Multiples of " + number + " less than 100:");
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }
        }
    }
}

