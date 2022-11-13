package Basic.ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournir = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int currentPoints = 0;
            int countW = 0;

        for (int i = 1; i <= tournir ; i++) {
            String currentTournir = scanner.nextLine();

            switch (currentTournir) {
                case "W":
                    currentPoints = currentPoints + 2000;
                    countW++;
                    break;
                case "F":
                    currentPoints = currentPoints + 1200;
                    break;
                case "SF":
                    currentPoints = currentPoints + 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", startingPoints + currentPoints);

        double averageWinningPoints = currentPoints * 1.0 / tournir;
        System.out.printf("Average points: %.0f%n", Math.floor(averageWinningPoints));

        double percentWins = (countW * 1.0 / tournir) * 100;

        System.out.printf("%.2f%%", percentWins);

    }
}
