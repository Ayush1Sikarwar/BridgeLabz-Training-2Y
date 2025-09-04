import java.util.Scanner;

public class AgeVoting {
    public static void main(String[] args) {
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < ages.length; i++) {
                ages[i] = sc.nextInt();
            }
        }

        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}
