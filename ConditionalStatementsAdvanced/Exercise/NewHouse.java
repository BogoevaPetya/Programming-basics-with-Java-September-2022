package Basic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine(); //Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (flower) {
            case "Roses":
                totalPrice = count * 5.0;
                if (count > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
                break;
            case "Dahlias":
                totalPrice = count * 3.80;
                if (count > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = count * 2.80;
                if (count > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = count * 3.0;
                if (count < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = count * 2.50;
                if (count < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }

        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, budget - totalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
        }


    }
}

