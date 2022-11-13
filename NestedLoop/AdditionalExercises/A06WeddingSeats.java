package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowCount = Integer.parseInt(scanner.nextLine());
        int seatCount = Integer.parseInt(scanner.nextLine());
        
        int counter = 0;

        for (char sector = 'A'; sector <= lastSector; sector++, rowCount++) {
            for (int row = 1; row <= rowCount; row++) {
                int seatInRow = seatCount;
                if (row % 2 == 0) {
                    seatInRow = seatCount + 2;
                }
                for (char seats = 'a'; seats < 'a' + seatInRow; seats++) {
                    System.out.printf("%c%d%s%n", sector, row, seats);
                    counter++;
                    
                }
            }
        }
            System.out.print(counter);
    }
}
