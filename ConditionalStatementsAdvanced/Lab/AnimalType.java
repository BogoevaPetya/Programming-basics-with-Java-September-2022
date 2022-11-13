package Basic.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

// dog -> mammal
//crocodile, tortoise, snake -> reptile
//others -> unknown

        switch (animalType) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
