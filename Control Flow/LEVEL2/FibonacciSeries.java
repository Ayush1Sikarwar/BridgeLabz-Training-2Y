import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();

            int t1 = 0, t2 = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(t1 + " ");
                int nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;
            }
        }
    }
}
