package Basic.Exams.June2019;

import java.util.Scanner;

public class E03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0;

        if (season.equals("Winter")) {
            if (destination.equals("Dubai")) {
                finalPrice = countDays * 45000;
                finalPrice = finalPrice - (finalPrice * 0.30);
            } else if (destination.equals("Sofia")) {
                finalPrice = countDays * 17000;
                finalPrice = finalPrice + (finalPrice * 0.25);
            } else if (destination.equals("London")) {
                finalPrice = countDays * 24000;
            }
        } else if (season.equals("Summer")) {
            if (destination.equals("Dubai")) {
                finalPrice = countDays * 40000;
                finalPrice = finalPrice - (finalPrice * 0.30);
            } else if (destination.equals("Sofia")) {
                finalPrice = countDays * 12500;
                finalPrice = finalPrice + (finalPrice * 0.25);
            } else if (destination.equals("London")) {
                finalPrice = countDays * 20250;
            }
        }

        if (budget >= finalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - finalPrice);
        } else {
            System.out.printf("The director needs %.2f leva more!", finalPrice - budget);
        }
    }
}
