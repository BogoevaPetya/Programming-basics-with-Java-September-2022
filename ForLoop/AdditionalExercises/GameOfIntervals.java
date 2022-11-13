package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double points = 0;

        double from0To9 = 0;
        double from10To19 = 0;
        double from20To29 = 0;
        double from30To39 = 0;
        double from40To50 = 0;
        double invalidNumbers = 0;

        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0) {
                 points = points / 2;
                 invalidNumbers++;
            }else if (number >= 0 && number <= 9) {
                points = points + (number * 0.20);
                from0To9++;
            } else if (number >= 10 && number <= 19) {
                points = points + (number * 0.30);
                from10To19++;
            } else if (number >= 20 && number <= 29) {
                points = points + (number * 0.40);
                from20To29++;
            } else if (number >= 30 && number <= 39) {
                points = points + 50;
                from30To39++;
            } else if (number >= 40 && number <= 50) {
                points = points + 100;
                from40To50++;
            } else if (number > 50) {
                points = points / 2;
                invalidNumbers++;
            }
        }

        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", (from0To9 / moves) * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", (from10To19 / moves) * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", (from20To29 / moves) * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", (from30To39 / moves) * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", (from40To50 / moves) * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", (invalidNumbers / moves) * 100);
    }
}
