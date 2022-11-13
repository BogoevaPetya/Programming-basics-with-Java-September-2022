package Basic.FirstStepsInCoding.AdditionalExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int countVegetables = Integer.parseInt(scanner.nextLine());
        int countFruits = Integer.parseInt(scanner.nextLine());

        double profit = priceVegetables * countVegetables + priceFruits * countFruits;
        double profitEuro = profit / 1.94;

        System.out.printf("%.2f", profitEuro);
    }
}
