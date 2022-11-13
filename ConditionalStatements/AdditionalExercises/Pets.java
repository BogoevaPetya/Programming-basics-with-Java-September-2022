package Basic.ConditionalStatements.AdditionalExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vacation = Integer.parseInt(scanner.nextLine());
        int leavedFood = Integer.parseInt(scanner.nextLine());
        double foodDog = Double.parseDouble(scanner.nextLine());
        double foodCat = Double.parseDouble(scanner.nextLine());
        double foodTurtle = Double.parseDouble(scanner.nextLine());

        double allFoodDog = foodDog * vacation;
        double allFoodCat = foodCat * vacation;
        double allFoodTurtle = (foodTurtle * vacation) / 1000;
        double allFoodNeeded = allFoodDog + allFoodCat + allFoodTurtle;
        double restFood = leavedFood - allFoodNeeded;

        if (allFoodNeeded <= leavedFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(restFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFoodNeeded - leavedFood));
        }

    }
}
