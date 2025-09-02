import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (less than 100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Number must be positive and less than 100.");
            sc.close();
            return;
        }

        System.out.println("Multiples of " + number + " less than 100:");
        for (int i = number; i < 100; i += number) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
