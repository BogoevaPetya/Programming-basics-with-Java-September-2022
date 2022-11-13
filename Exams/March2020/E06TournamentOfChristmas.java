package Basic.Exams.March2020;

import java.util.Scanner;

public class E06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int competitionDays = Integer.parseInt(scanner.nextLine());

        double sumAllWonMoney = 0;
        int winsCount = 0;
        int lossCount = 0;


        for (int i = 1; i <= competitionDays; i++) {
            String sport = scanner.nextLine();

            double wonMoneyForTheDay = 0;
            int countWinsForTheDay = 0;
            int countLossForTheDay = 0;

            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    wonMoneyForTheDay += 20;
                    countWinsForTheDay++;
                } else {
                    countLossForTheDay++;
                }

                sport = scanner.nextLine();
            }

            if (countWinsForTheDay > countLossForTheDay) { //тук отброявам броя на печалбите за деня
                wonMoneyForTheDay = wonMoneyForTheDay + (wonMoneyForTheDay * 0.10);
                sumAllWonMoney += wonMoneyForTheDay;
                winsCount++;
            } else {
                sumAllWonMoney +=wonMoneyForTheDay;
                lossCount++;
            }
        }

        if (winsCount > lossCount) { //тук отброявам броя на печалбите за всички дни
            sumAllWonMoney = sumAllWonMoney + (sumAllWonMoney * 0.20);
            System.out.printf("You won the tournament! Total raised money: %.2f", sumAllWonMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumAllWonMoney);
        }
    }
}
