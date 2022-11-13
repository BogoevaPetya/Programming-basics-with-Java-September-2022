package Basic.WhileLoop.Lab;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;

        while (currentNum <= number) {
            System.out.println(currentNum);
            currentNum = currentNum * 2 + 1;

        }


    }
}
