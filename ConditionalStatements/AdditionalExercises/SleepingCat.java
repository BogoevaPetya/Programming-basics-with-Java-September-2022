package Basic.ConditionalStatements.AdditionalExercises;

import java.util.Scanner;

public class SleepingCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int playTimeDaysOff = daysOff * 127;
        int playTimeWorkingDays = (365 - daysOff) * 63;
        int sumPlayTime = playTimeDaysOff + playTimeWorkingDays;

        if (sumPlayTime >= 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", (sumPlayTime - 30000)/60, (sumPlayTime - 30000)%60);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", (30000 - sumPlayTime)/60, (30000-sumPlayTime)%60);
        }
    }
}
