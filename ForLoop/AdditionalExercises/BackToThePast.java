package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritatedMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int yearsToSpentMoney = yearToLive - 1800;

        double moneySpent = 0;

        for (int i = 0; i <= yearsToSpentMoney ; i++) {
            int currentYear = 1800 + i;

            if (currentYear % 2 == 0) {
                moneySpent = moneySpent + 12000;
            } else {
                int currentAge = 18 + i;
                moneySpent = moneySpent + 12000 + 50 * currentAge;
            }
        }

        if (inheritatedMoney >= moneySpent) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritatedMoney - moneySpent);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", moneySpent - inheritatedMoney);
        }
    }
}
