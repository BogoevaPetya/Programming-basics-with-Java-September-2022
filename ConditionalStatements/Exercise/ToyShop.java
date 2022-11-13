package Basic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount = 0;

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double pricePuzzle = countPuzzle * 2.60;
        double priceDolls = countDolls * 3;
        double priceBears = countBears * 4.10;
        double priceMinions = countMinions * 8.20;
        double priceTrucks = countTrucks * 2;

        double profit = pricePuzzle + priceDolls + priceBears + priceMinions + priceTrucks;

        int totalToys = countPuzzle + countDolls + countBears + countMinions + countTrucks;

        if (totalToys >= 50) {
            profit = profit - (profit * 0.25);
        }

        double totalProfit = profit - (profit * 0.1);

        if (priceExcursion > totalProfit) {
            System.out.printf("Not enough money! %.2f lv needed.", priceExcursion - totalProfit);
        } else {
            System.out.printf("Yes! %.2f lv left.", totalProfit - priceExcursion);
        }


        }

    }

