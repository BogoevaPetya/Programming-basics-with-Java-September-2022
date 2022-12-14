package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * high;
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int currentInput = Integer.parseInt(input);
            freeSpace -= currentInput;

            if (freeSpace < 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (freeSpace < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
