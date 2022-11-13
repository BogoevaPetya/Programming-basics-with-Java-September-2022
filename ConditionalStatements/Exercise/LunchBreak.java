package Basic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namefilm = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration / 8.0;
        double restDuration = breakDuration / 4.0;

        double balance = (breakDuration - (lunchDuration + restDuration));

        if (balance >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", namefilm, Math.ceil(balance - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", namefilm, Math.ceil(episodeDuration - balance));

        }
    }
}
