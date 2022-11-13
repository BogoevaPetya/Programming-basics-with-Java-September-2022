package Basic.WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minValue = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            Integer currentInput = Integer.parseInt(input);

            if (currentInput < minValue) {
                minValue = currentInput;
            }

            input = scanner.nextLine();
        }

        System.out.println(minValue);
    }
}
