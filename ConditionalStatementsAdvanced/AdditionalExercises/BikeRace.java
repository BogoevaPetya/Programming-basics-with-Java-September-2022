package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJunior = Integer.parseInt(scanner.nextLine());
        int countSenior = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double tax = 0;

        switch (trace) {
            case "trail":
                tax = countJunior * 5.50 + countSenior * 7;
                break;
            case "cross-country":
                tax = countJunior * 8 + countSenior * 9.50;
                if ((countJunior + countSenior) >= 50) {
                    tax = tax - (tax * 0.25);
                }
                break;
            case "downhill":
                tax = countJunior * 12.25 + countSenior * 13.75;
                break;
            case "road":
                tax = countJunior * 20 + countSenior * 21.50;
                break;
        }

        System.out.printf("%.2f", tax - (tax * 0.05));
    }
}
