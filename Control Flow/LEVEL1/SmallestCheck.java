import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if (num1 < num2 && num1 < num3) {
                System.out.println("Yes, the first number is the smallest.");
            } else {
                System.out.println("No, the first number is not the smallest.");
            }
        }
    }
}

