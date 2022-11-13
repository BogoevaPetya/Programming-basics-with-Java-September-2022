package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double priceWater = 20 * months;
        double priceInternet = 15 * months;
        double priceElectricity = 0;

        for (int i = 1; i <= months ; i++) {
            double electricityBills = Double.parseDouble(scanner.nextLine());
            priceElectricity = priceElectricity + electricityBills;
        }

        double priceOther = (priceElectricity + priceWater + priceInternet)  + (priceElectricity + priceWater + priceInternet) * 0.20;

        System.out.printf("Electricity: %.2f lv%n", priceElectricity);
        System.out.printf("Water: %.2f lv%n", priceWater);
        System.out.printf("Internet: %.2f lv%n", priceInternet);
        System.out.printf("Other: %.2f lv%n", priceOther);

        System.out.printf("Average: %.2f lv%n", (priceElectricity + priceWater + priceInternet + priceOther) / months);
    }
}
