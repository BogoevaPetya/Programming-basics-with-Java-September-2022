package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String accomodation = "";
        String location = "";

        if (budget <= 1000) {
            accomodation = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                budget = budget * 0.65;
            } else {
                location = "Morocco";
                budget = budget * 0.45;
            }
        } else if (budget > 1000 && budget <= 3000) {
            accomodation = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                budget = budget * 0.80;
            } else {
                location = "Morocco";
                budget = budget * 0.60;
            }
        } else if (budget > 3000) {
            accomodation = "Hotel";
            budget = budget * 0.90;
            if (season.equals("Summer")) {
                location = "Alaska";
            } else {
                location = "Morocco";
            }
        }

        System.out.printf("%s - %s - %.2f", location,accomodation, budget);
    }
}
