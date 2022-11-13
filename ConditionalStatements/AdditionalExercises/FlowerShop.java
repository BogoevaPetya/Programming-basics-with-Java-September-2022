package Basic.ConditionalStatements.AdditionalExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double priceMagnolia = magnolia * 3.25;
        double priceHyacinth = hyacinth * 4;
        double priceRoses = roses * 3.50;
        double priceCactus = cactus * 8;
        double priceOrder = priceMagnolia + priceHyacinth + priceRoses + priceCactus;
        double profit = priceOrder - (priceOrder * 0.05);

        if (profit >= pricePresent) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profit - pricePresent));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(pricePresent - profit));
        }
    }
}
