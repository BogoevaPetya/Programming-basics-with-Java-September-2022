package Basic.ConditionalStatements.AdditionalExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int debitP1 = Integer.parseInt(scanner.nextLine());
        int debitP2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double volumeP1 = debitP1 * h;
        double volumeP2 = debitP2 * h;
        double filledUp = volumeP1 + volumeP2;

        double filledUpPercent = filledUp / volume * 100.0;
        double filledP1Percent = volumeP1 / filledUp * 100.0;
        double filledP2Percent = volumeP2 / filledUp * 100.0;
        double overflow = filledUp - volume;

        if (filledUp <= volume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", filledUpPercent, filledP1Percent, filledP2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overflow);
        }
    }
}
