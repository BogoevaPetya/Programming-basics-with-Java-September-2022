package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A04CarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());

        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                for (int k = startInterval; k <= endInterval; k++) {
                    for (int l = startInterval; l <= endInterval; l++) {
                        int sumSecondAndThird = j + k;
                        boolean isEvenFirst = i % 2 == 0;
                        boolean isOddFirst = i % 2 != 0;
                        boolean isEvenForth = l % 2 == 0;
                        boolean isOddForth = l % 2 != 0;


                        if (isEvenFirst && isOddForth || isOddFirst && isEvenForth) {
                            if (i > l && sumSecondAndThird % 2 == 0) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }

                }
            }
        }
    }
}
