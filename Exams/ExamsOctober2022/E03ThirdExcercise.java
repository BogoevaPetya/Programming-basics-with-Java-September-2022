package Basic.Exams.ExamsOctober2022;

import java.util.Scanner;

public class E03ThirdExcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDancers = Integer.parseInt(scanner.nextLine());
        double countPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double money = 0;

        if (place.equals("Bulgaria")) {
            money = countPoints * countDancers;
            if (season.equals("summer")) {
                money = money - (money * 0.05);
            } else {
                money = money - (money * 0.08);
            }
        } else {
            money = countPoints * countDancers + (countPoints * countDancers * 0.50);
            if (season.equals("summer")) {
                money = money - (money * 0.10);
            } else {
                money = money - (money * 0.15);
            }
        }

        double donatedMoney = money * 0.75;
        double moneyPerPerson = (money - donatedMoney) / countDancers;

        System.out.printf("Charity - %.2f%n", donatedMoney);
        System.out.printf("Money per dancer - %.2f", moneyPerPerson);

    }
}
