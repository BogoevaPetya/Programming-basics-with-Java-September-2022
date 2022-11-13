package Basic.ConditionalStatements.AdditionalExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double countGrape = x * y;
        double countGrapeForWine = countGrape * 0.4;
        double litersWine = countGrapeForWine / 2.5;

        if (litersWine < z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z - litersWine));
        } else if (litersWine >=z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(litersWine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(litersWine - z), Math.ceil((litersWine - z)/employees));
        }

    }
}
