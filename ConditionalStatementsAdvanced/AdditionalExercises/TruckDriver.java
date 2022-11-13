package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonth = Double.parseDouble(scanner.nextLine());
        double profitMonth = 0;
        double totalProfit = 0;
        double totalProfitAfterTax = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmMonth <= 5000) {
                    profitMonth = 0.75 * kmMonth;
                } else if (kmMonth > 5000 && kmMonth <= 10000) {
                    profitMonth = 0.95 * kmMonth;
                } else if (kmMonth > 10000 && kmMonth <= 200000) {
                    profitMonth = 1.45 * kmMonth;
                }
                break;
            case "Summer":
                if (kmMonth <= 5000) {
                    profitMonth = 0.90 * kmMonth;
                } else if (kmMonth > 5000 && kmMonth <= 10000) {
                    profitMonth = 1.10 * kmMonth;
                } else if (kmMonth > 10000 && kmMonth <= 200000) {
                    profitMonth = 1.45 * kmMonth;
                }
                break;
            case "Winter":
                if (kmMonth <= 5000) {
                    profitMonth = 1.05 * kmMonth;
                } else if (kmMonth > 5000 && kmMonth <= 10000) {
                    profitMonth = 1.25 * kmMonth;
                } else if (kmMonth > 10000 && kmMonth <= 200000) {
                    profitMonth = 1.45 * kmMonth;
                }
                break;
        }

        totalProfit = profitMonth * 4;
        totalProfitAfterTax = totalProfit - (totalProfit * 0.10);

        System.out.printf("%.2f", totalProfitAfterTax);
    }
}

