import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter base number: ");
            int number = sc.nextInt();

            System.out.print("Enter power: ");
            int power = sc.nextInt();

            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;  // multiply result by number
                counter++;         // increase counter
            }

            System.out.println(number + "^" + power + " = " + result);
        }
    }
}
