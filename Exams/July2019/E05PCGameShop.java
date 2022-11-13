package Basic.Exams.July2019;

import java.util.Scanner;

public class E05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());
        int countHearthstone = 0;
        int countFornite = 0;
        int countOverwatch = 0;
        int countOthers = 0;

        for (int i = 1; i <= soldGames; i++) {
            String nameGame = scanner.nextLine();

            if (nameGame.equals("Hearthstone")) {
                countHearthstone++;
            } else if (nameGame.equals("Fornite")) {
                countFornite++;
            } else if (nameGame.equals("Overwatch")) {
                countOverwatch++;
            } else {
                countOthers++;
            }
        }

        System.out.printf("Hearthstone - %.2f%%%n", (countHearthstone * 1.0 / soldGames) * 100);
        System.out.printf("Fornite - %.2f%%%n", (countFornite * 1.0 / soldGames) * 100);
        System.out.printf("Overwatch - %.2f%%%n", (countOverwatch * 1.0 / soldGames) * 100);
        System.out.printf("Others - %.2f%%%n", (countOthers * 1.0 / soldGames) * 100);


    }
}
