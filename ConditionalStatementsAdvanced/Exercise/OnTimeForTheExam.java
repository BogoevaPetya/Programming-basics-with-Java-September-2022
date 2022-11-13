package Basic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int hourA = Integer.parseInt(scanner.nextLine());
        int minA = Integer.parseInt(scanner.nextLine());

        int totalTime = hour * 60 + min;
        int totalTimeA = hourA * 60 + minA;
        int diff = totalTime - totalTimeA;

        if (diff == 0) {
            System.out.println("On time");
        } else if (diff > 0 && diff <=30) {
            System.out.printf("On time%n%d minutes before the start", diff);
        } else if (diff < 0) {
            diff = Math.abs(diff);
            System.out.println("Late");
            if (diff >= 60) {
                hour = diff / 60;
                min = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, min);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                hour = diff / 60;
                min = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, min);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
