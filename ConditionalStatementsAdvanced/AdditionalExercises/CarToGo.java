package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeCar = "";
        String classCar = "";

        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                budget = budget * 0.35;
            } else {
                typeCar = "Jeep";
                budget = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            classCar = "Compact class";
            if (season.equals("Summer")) {
                typeCar = "Cabrio";
                budget = budget * 0.45;
            } else {
                typeCar = "Jeep";
                budget = budget * 0.80;
            }
        } else if (budget > 500) {
            classCar = "Luxury class";
            typeCar = "Jeep";
            budget = budget * 0.90;
        }

        System.out.printf("%s%n", classCar);
        System.out.printf("%s - %.2f", typeCar, budget);
    }
}
