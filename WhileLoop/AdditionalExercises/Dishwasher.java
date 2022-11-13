package Basic.WhileLoop.AdditionalExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int quantityWasher = bottles * 750;
        String input = scanner.nextLine();
        int count = 1;
        int dishes = 0;
        int cookers = 0;

        while (!input.equals("End")) {
            int dishesOrCookers = Integer.parseInt(input);
            if (count % 3 == 0) {
                quantityWasher = quantityWasher - (dishesOrCookers * 15); //за тенджери
                cookers += dishesOrCookers;
            } else {
                quantityWasher = quantityWasher - (dishesOrCookers * 5); //за чинии
                dishes += dishesOrCookers;
            }

            if (quantityWasher < 0) {
                break;
            }

            count++;
            input = scanner.nextLine();
        }

        if (quantityWasher >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, cookers);
            System.out.printf("Leftover detergent %d ml.%n", quantityWasher);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantityWasher));
        }
    }
}
