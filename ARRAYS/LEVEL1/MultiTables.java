public class MultiTables {
    public static void main(String[] args) {
        int[][] results = new int[4][10]; // 6 to 9, 10 multiples each

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                results[num - 6][i - 1] = num * i;
            }
        }

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + results[num - 6][i - 1]);
            }
            System.out.println();
        }
    }
}
