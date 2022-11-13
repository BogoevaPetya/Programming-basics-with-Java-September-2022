package Basic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideocards = videocards * 250;
        double priceProcessors = processors * (priceVideocards * 0.35);
        double priceRam = ram * (priceVideocards * 0.10);

        double priceAll = priceVideocards + priceProcessors + priceRam;

        if (videocards > processors) {
            priceAll = priceAll - (priceAll * 0.15);
        }
        
        if (budget >= priceAll) {
            System.out.printf("You have %.2f leva left!", budget - priceAll);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", priceAll - budget);
        }
    }
}
