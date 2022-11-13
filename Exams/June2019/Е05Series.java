package Basic.Exams.June2019;

import java.util.Scanner;

public class Е05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSeries = Integer.parseInt(scanner.nextLine());

        double sumSeries = 0;

        for (int i = 1; i <= countSeries; i++) {
            String nameSeries = scanner.nextLine();
            double priceSeries = Double.parseDouble(scanner.nextLine());


            if (nameSeries.equals("Thrones")) {
                priceSeries = priceSeries - (priceSeries * 0.50);
            } else if (nameSeries.equals("Lucifer")) {
                priceSeries = priceSeries - (priceSeries * 0.40);
            } else if (nameSeries.equals("Protector")) {
                priceSeries = priceSeries - (priceSeries * 0.30);
            } else if (nameSeries.equals("TotalDrama")) {
                priceSeries = priceSeries - (priceSeries * 0.20);
            } else if (nameSeries.equals("Area")) {
                priceSeries = priceSeries - (priceSeries * 0.10);
            }

                budget = budget - priceSeries;
                sumSeries++;

        }

        if (budget >= 0) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }
    }
}
