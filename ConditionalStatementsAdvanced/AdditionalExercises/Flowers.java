package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chryzanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayOrNot = scanner.nextLine();
        double totalPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                totalPrice = chryzanthemums * 2 + roses * 4.10 + tulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                totalPrice = chryzanthemums * 3.75 + roses * 4.50 + tulips * 4.15;
                break;
        }

        if (holidayOrNot.equals("Y")) {
            totalPrice = totalPrice + (totalPrice * 0.15);
        }

        if (tulips > 7 && season.equals("Spring")) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        if (roses >= 10 && season.equals("Winter")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }

        if (chryzanthemums + roses + tulips > 20) {
            totalPrice = totalPrice - (totalPrice * 0.20);
        }

        System.out.printf("%.2f", totalPrice + 2);


    }
}
