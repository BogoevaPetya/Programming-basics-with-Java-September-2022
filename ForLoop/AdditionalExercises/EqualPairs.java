package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumPairsSingle = 0;
        int sumPairsPrevious = 0;
        int maxDiff = Integer.MIN_VALUE;
        int sumPairsAll = 0;

        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            sumPairsSingle = number1 + number2;
            sumPairsAll = sumPairsAll + sumPairsSingle;

            if (i == 1) {
                sumPairsPrevious = sumPairsSingle;
            }

            if (sumPairsSingle != sumPairsPrevious && i >= 2) {
                int difference = Math.abs(sumPairsPrevious - sumPairsSingle);
                if (difference > maxDiff) {
                    maxDiff = difference;
                }
            }

            if (sumPairsSingle != sumPairsPrevious) {
                sumPairsPrevious = sumPairsSingle;
            }

        }

        if (sumPairsAll / n == sumPairsSingle) {
            System.out.printf("Yes, value=%d", sumPairsSingle);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
