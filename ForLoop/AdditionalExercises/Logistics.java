package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCargos = Integer.parseInt(scanner.nextLine());

        double priceMicrobus = 0;
        double priceTruck = 0;
        double priceTrain = 0;

        double weightMicrobus = 0;
        double weightTruck = 0;
        double weightTrain = 0;

        double sumWeight = 0;

        for (int i = 1; i <= countCargos; i++) {
            int weight = Integer.parseInt(scanner.nextLine());

            if (weight <= 3) {
                priceMicrobus = priceMicrobus + weight * 200; // бях написала priceMicrobus = weight * 200 и така не натрупва цената всеки път, когато имаме микробус, а я смята само веднъж
                weightMicrobus = weightMicrobus + weight;
            } else if (weight >= 4 && weight <= 11) {
                priceTruck = priceTruck + weight * 175;
                weightTruck = weightTruck + weight;
            } else if (weight >= 12) {
                priceTrain = priceTrain + weight * 120;
                weightTrain = weightTrain + weight;
            }

            sumWeight = sumWeight + weight;
        }

        double averagePriceWeigh = (priceMicrobus + priceTruck + priceTrain) / sumWeight;
        System.out.printf("%.2f%n", averagePriceWeigh);

        System.out.printf("%.2f%%%n", (weightMicrobus / sumWeight) * 100);
        System.out.printf("%.2f%%%n", (weightTruck / sumWeight) * 100);
        System.out.printf("%.2f%%%n", (weightTrain / sumWeight) * 100);

    }
}
