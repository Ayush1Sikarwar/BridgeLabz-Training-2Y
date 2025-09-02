public class DayOfWeek {
    public static void main(String[] args) {
        // Command-line arguments: month day year
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Step 1: Calculate y0
        int y0 = y - (14 - m) / 12;

        // Step 2: Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Calculate day of week
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output
        System.out.println("Day Index: " + d0);

        // Optional: Print actual day name
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of Week: " + days[d0]);
    }
}
