package Basic.FirstStepsInCoding.Lab;

        import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int foodDog = Integer.parseInt(scanner.nextLine());
        int foodCat = Integer.parseInt(scanner.nextLine());

        double FoodDog = foodDog * 2.50;
        double FoodCat = foodCat * 4;

        double finalSum = FoodDog + FoodCat;


        System.out.println(finalSum + "lv.");

    }
}