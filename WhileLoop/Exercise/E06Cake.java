package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int countPieces = length * width;

        String input = scanner.nextLine(); //колко парчета се взимат или командата STOP

        while (!input.equals("STOP")) {
            int currentPieces = Integer.parseInt(input);
            countPieces -= currentPieces;

            if (countPieces < 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (countPieces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
        } else {
            System.out.printf("%d pieces are left.", countPieces);
        }
    }
}
