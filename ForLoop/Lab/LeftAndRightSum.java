package Basic.ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sumLeft = sumLeft + currentNumber;
        }

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sumRight = sumRight + currentNumber;
        }

        int diff = Math.abs(sumLeft - sumRight);
        if (sumRight == sumLeft) {
            System.out.printf("Yes, sum = %d", sumRight);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
