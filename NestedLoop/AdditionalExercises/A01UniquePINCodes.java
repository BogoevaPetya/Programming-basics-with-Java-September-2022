package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= firstNumber; i++) {
            for (int j = 2; j <= secondNumber; j++) {
                for (int k = 1; k <= thirdNumber; k++) {

                    int counter = 0;
                    if (secondNumber % j == 0) {
                        counter++;
                    }

                    if (i % 2 ==0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d ", i, j, k);
                        System.out.println();
                    }
                }
            }
        }
    }
}
