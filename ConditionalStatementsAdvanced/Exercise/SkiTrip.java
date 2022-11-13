package Basic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typePremises = scanner.nextLine();
        String positiveNegative = scanner.nextLine();
        double nightPrice = 0.0;
        double nights = days - 1;
        double total = 0;

        switch (typePremises) {
            case "room for one person":
                nightPrice = 18.0;
                total = nights * nightPrice;
                break;
            case "apartment":
                nightPrice = 25.0;
                total = nights * nightPrice;
                if (nights <= 10) {
                    total = total - (total * 0.3);
                } else if (nights > 10 && nights <= 15) {
                    total = total - (total * 0.35);
                } else {
                    total = total - (total * 0.50);
                }
                break;
            case "president apartment":
                nightPrice = 35.0;
                total = nights * nightPrice;
                if (nights <= 10) {
                    total = total - (total * 0.10);
                } else if (nights > 10 && nights <= 15) {
                    total = total - (total * 0.15);
                } else {
                    total = total - (total * 0.20);
                }
                break;
        }

        if (positiveNegative.equals("positive")) {
            total = total + (total * 0.25);
            System.out.printf("%.2f", total);
        } else {
            total = total - (total * 0.10);
            System.out.printf("%.2f", total);
        }

    }
}
