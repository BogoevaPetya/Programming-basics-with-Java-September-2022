package Basic.Exams.June2019;

import java.util.Scanner;

public class Е04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String actorName = scanner.nextLine();

        while (!actorName.equals("ACTION")) {

            if (actorName.length() > 15) {
                budget = budget - (budget * 0.20);
            } else {
                actorName = scanner.nextLine();
                double salary = Double.parseDouble(actorName);
                budget = budget - salary;
            }

            if (budget <= 0) {
                break;
            }

            actorName = scanner.nextLine();
        }

        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
