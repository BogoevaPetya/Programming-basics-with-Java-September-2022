package Basic.ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double givenMoney = 0;
        double savedMoney = 0;

        for (int birthday = 1; birthday <= age; birthday++) {

            if (birthday % 2 == 0) {
                givenMoney = givenMoney + 10; //givenMoney += 10
                savedMoney = savedMoney + givenMoney;
            } else {
                countToys++;
            }
        }

        double totalSum = (countToys * priceToy) + savedMoney;

        if (totalSum >= priceWasher) {
            System.out.printf("Yes! %.2f", totalSum - priceWasher);
        } else {
            System.out.printf("No! %.2f", priceWasher - totalSum);
        }
    }
}
