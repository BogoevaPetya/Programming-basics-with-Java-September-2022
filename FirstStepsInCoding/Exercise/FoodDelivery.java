package Basic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChickenMenu = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = countChickenMenu * 10.35;
        double priceFishMenu = countFishMenu * 12.40;
        double priceVegetarianMenu = countVegetarianMenu * 8.15;
        double priceAllMenus = priceChickenMenu + priceFishMenu + priceVegetarianMenu;
        double priceDessert = priceAllMenus * 0.2;
        double priceDelivery = 2.50;

        double totalPrice = priceAllMenus + priceDessert + priceDelivery;

        System.out.println(totalPrice);


    }
}
