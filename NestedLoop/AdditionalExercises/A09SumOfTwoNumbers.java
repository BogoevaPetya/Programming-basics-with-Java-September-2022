package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0; //за всички възможни комбинации от i и j
        int counter2 = 0; //да брои дали има сума от i + j =, която да е равна на магическото число

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                if (counter2 == 1) {
                    break;
                }
                counter++;

                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    counter2++;

                }
                if (i == end && j == end && counter2 == 0) {
                    System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
                }

            }
        }
    }
}
