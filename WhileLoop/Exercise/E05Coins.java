package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double changeInCoins = Math.round(change * 100); // защото например 0,56 го пише 0,560000001
        int coinsCounter = 0;

        while (changeInCoins > 0) {
            if (changeInCoins >= 200) {
                coinsCounter++;
                changeInCoins = changeInCoins - 200;
            } else if (changeInCoins >= 100) {
                coinsCounter++;
                changeInCoins = changeInCoins - 100;
            } else if (changeInCoins >= 50) {
                coinsCounter++;
                changeInCoins = changeInCoins - 50;
            } else if (changeInCoins >= 20) {
                coinsCounter++;
                changeInCoins = changeInCoins - 20;
            } else if (changeInCoins >= 10) {
                coinsCounter++;
                changeInCoins = changeInCoins - 10;
            } else if (changeInCoins >= 5) {
                coinsCounter++;
                changeInCoins = changeInCoins - 5;
            } else if (changeInCoins >= 2) {
                coinsCounter++;
                changeInCoins = changeInCoins - 2;
            } else if (changeInCoins >= 1) {
                coinsCounter++;
                changeInCoins = changeInCoins - 1;
            }
        }

        System.out.println(coinsCounter);
    }
}
