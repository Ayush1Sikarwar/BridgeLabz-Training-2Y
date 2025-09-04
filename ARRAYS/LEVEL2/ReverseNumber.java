import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int count = 0, temp = num;
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            int[] digits = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                digits[i] = num % 10;
                num /= 10;
            }

            System.out.print("Reversed number: ");
            for (int d : digits) System.out.print(d);
        }
    }
}
