package Basic.Exams.ExamsOctober2022;

import java.util.Scanner;

public class E02SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double profit = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double spentPocketMoney = 5 * pocketMoney;
        double spentProfit = 5 * profit;
        double allSpentMoney = spentPocketMoney + spentProfit;
        double allSpentMoneyWithoutExpenses = allSpentMoney - expenses;

        if (allSpentMoneyWithoutExpenses >= priceGift) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", allSpentMoneyWithoutExpenses);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", priceGift - allSpentMoneyWithoutExpenses);
        }
    }
}
