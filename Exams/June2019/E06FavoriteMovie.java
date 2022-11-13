package Basic.Exams.June2019;

import java.util.Scanner;

public class E06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxPoints = -1;
        String favoriteMovie = "";
        int counter = 0;

        while (!input.equals("STOP")) {
            counter++;

            int points = 0;
            int length = input.length();

            for (int i = 0; i < length; i++) {
                int currentChar = input.charAt(i);
                points += currentChar;

                if (currentChar >= 65 && currentChar <= 90) {
                    points = points - length;
                }
                if (currentChar >= 97 && currentChar <= 122) {
                    points = points - (length * 2);
                }
            }
            if (points > maxPoints) {
                maxPoints = points;
                favoriteMovie = input;
            }

            if (counter >= 7) {
                break;
            }

            input = scanner.nextLine();
        }
        if (counter >= 7) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", favoriteMovie, maxPoints);
    }
}