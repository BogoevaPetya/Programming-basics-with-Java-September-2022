package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());
        double priceTicket = 0;
        double transportPrice = 0;
        double totalPrice = 0;

        switch (category) {
            case "VIP":
                priceTicket = countPeople * 499.99;
                break;
            case "Normal":
                priceTicket = countPeople * 249.99;
                break;
        }

        if (countPeople >= 1 && countPeople <= 4) {
            transportPrice = budget * 0.75;
        } else if (countPeople >= 5 && countPeople <= 9) {
            transportPrice = budget * 0.60;
        } else if (countPeople >= 10 && countPeople <= 24) {
            transportPrice = budget * 0.50;
        } else if (countPeople >= 25 && countPeople <= 49) {
            transportPrice = budget * 0.4;
        } else {
            transportPrice = budget * 0.25;
        }

        totalPrice = priceTicket + transportPrice;

        if (budget > totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }


    }
}

