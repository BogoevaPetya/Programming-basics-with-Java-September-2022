package Basic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String evenOrOdd = "";

        int result = 0;

        switch (operator) {
            case ("+"): {
                result = N1 + N2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
            }
            System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, evenOrOdd);
            break;
            case ("-"): {
                result = N1 - N2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
            } System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, evenOrOdd);
            break;
            case ("*"): {
                result = N1 * N2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
            } System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, evenOrOdd);
            break;
            case ("/"): {
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double divideResult = (1.0 * N1) / N2;
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, divideResult);
                }
            }
                break;
            case ("%"):
                if (N2 ==0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operator, N2, result);
                }
                break;
        }

    }
}
