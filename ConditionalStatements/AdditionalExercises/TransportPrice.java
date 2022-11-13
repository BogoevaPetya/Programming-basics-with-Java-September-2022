package Basic.ConditionalStatements.AdditionalExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double priceBus = km * 0.09;
        double priceTrain = km * 0.06;

        if (km < 20) {
            if (dayOrNight.equals("day")) {
                System.out.printf("%.2f", (0.79 * km) + 0.70);
            } else {
                System.out.printf("%.2f", (0.90 * km) + 0.70);
            }
        } else if (km < 100) {
            System.out.printf("%.2f", priceBus);
        } else {
            System.out.printf("%.2f", priceTrain);
        }


    }
}
