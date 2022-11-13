package Basic.Exams.July2019;

import java.util.Scanner;

public class E06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sum = 0;
        int maxPoints = Integer.MIN_VALUE;
        String theMostPowerfulWordIs = "";

        while (!input.equals("End of words")) {
            int length = input.length();
            int points = 0;
            for (int i = 0; i < input.length(); i++) {
                points += input.charAt(i);
            }
            if (input.charAt(0) == 'a' || input.charAt(0) == 'A' || input.charAt(0) == 'e' || input.charAt(0) == 'E'
                    || input.charAt(0) == 'i' || input.charAt(0) == 'I' || input.charAt(0) == 'o' || input.charAt(0) == 'O'
                    || input.charAt(0) == 'u' || input.charAt(0) == 'U' || input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
                points = points * length;
            } else {
                points = points / length;
            }

            if (points >= maxPoints) {
                maxPoints = points;
                theMostPowerfulWordIs = input;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", theMostPowerfulWordIs, Math.ceil(maxPoints));
    }
}
