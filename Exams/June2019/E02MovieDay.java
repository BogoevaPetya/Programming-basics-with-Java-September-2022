package Basic.Exams.June2019;

import java.util.Scanner;

public class E02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForMovie = Integer.parseInt(scanner.nextLine());
        int countScenes = Integer.parseInt(scanner.nextLine());
        int timeForOneScene = Integer.parseInt(scanner.nextLine());

        double timeForAllScenes = (countScenes * timeForOneScene) + (timeForMovie * 0.15);

        if (timeForMovie >= timeForAllScenes) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timeForMovie - timeForAllScenes));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(timeForAllScenes - timeForMovie));
        }
    }
}
