package Basic.WhileLoop.AdditionalExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;
        int cashCounter = 0;
        int cardCounter = 0;
        int collectedSumCards = 0;
        int collectedSumCash = 0;

        while (neededMoney > sum) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                break;
            }

            int collectedMoney = Integer.parseInt(input);

            if (counter % 2 == 0) {
                if (collectedMoney < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    cardCounter++;
                    sum += collectedMoney;
                    collectedSumCards += collectedMoney;
                    System.out.println("Product sold!");
                }
            } else {
                if (collectedMoney > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashCounter++;
                    sum += collectedMoney;
                    collectedSumCash += collectedMoney;
                    System.out.println("Product sold!");
                }
            }

            counter++;
        }

        if (neededMoney <= sum ) {
            System.out.printf("Average CS: %.2f%n", (collectedSumCash * 1.0) / cashCounter);
            System.out.printf("Average CC: %.2f%n", (collectedSumCards * 1.0) / cardCounter);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }




    }
}
