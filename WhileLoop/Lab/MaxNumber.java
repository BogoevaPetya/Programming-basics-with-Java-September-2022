package Basic.WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int currentInput = Integer.parseInt(input);

            if (currentInput > maxValue) {
                maxValue = currentInput;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxValue);
    }
}
