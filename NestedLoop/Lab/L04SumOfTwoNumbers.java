package Basic.NestedLoop.Lab;

import java.util.Scanner;

public class L04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int allCombinations = 0;

        boolean isRightComb = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end ; j++) {
                int sum = i + j;
                allCombinations++;
                if (sum == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", allCombinations, i, j, magicNum);
                    isRightComb = true;
                    break;
                }
            }

            if (isRightComb) {
                break;
            }
        }

        if (!isRightComb) {
            System.out.printf("%d combinations - neither equals %d", allCombinations, magicNum);
        }
    }
}
