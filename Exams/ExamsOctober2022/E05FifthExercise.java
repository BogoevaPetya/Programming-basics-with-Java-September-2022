package Basic.Exams.ExamsOctober2022;

import java.util.Scanner;

public class E05FifthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int maxGoals = 0;
        String bestPlayer = "";
        int hatTrick = 3;

        while (!playerName.equals("END")) {
            int countGoals = Integer.parseInt(scanner.nextLine());

            if (countGoals > maxGoals) {
                maxGoals = countGoals;
                bestPlayer = playerName;
            }

            if (countGoals >= 10) {
                break;
            }


            playerName = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (hatTrick <= maxGoals) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
