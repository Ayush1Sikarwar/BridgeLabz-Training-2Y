import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter heights of 11 players:");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 11; i++) {
                heights[i] = sc.nextDouble();
                sum += heights[i];
            }
        }

        double mean = sum / 11;
        System.out.println("Mean height of team = " + mean);
    }
}
