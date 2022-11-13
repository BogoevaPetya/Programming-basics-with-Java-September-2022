package Basic.Exams.July2019;

import java.util.Scanner;

public class E02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceAtNight = Double.parseDouble(scanner.nextLine());
        int percentAdditionalSpent = Integer.parseInt(scanner.nextLine());

        double priceAllNights = 0;
        double additionalSpent = 0;
        double allSpent = 0;

        if (countNights > 7) {
            priceAtNight = (priceAtNight - (priceAtNight * 0.05));
        }

        priceAllNights = countNights * priceAtNight;
        additionalSpent = budget * (percentAdditionalSpent / 100.0);
        allSpent = priceAllNights + additionalSpent;

        if (allSpent < budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - allSpent);
        } else {
            System.out.printf("%.2f leva needed.", allSpent - budget);
        }
    }
}
