package Basic.ConditionalStatements.Lab;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.print(firstNum);
        } else {
            System.out.print(secondNum);
        }
    }
}
