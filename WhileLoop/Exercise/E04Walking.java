package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;

        int sumSteps = 0;

        while (sumSteps < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int wayHome = Integer.parseInt(scanner.nextLine());
                sumSteps += wayHome;
                break;
            } else {
                int currentSteps = Integer.parseInt(input);
                sumSteps += currentSteps;
            }
        }

        if (sumSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - sumSteps);
        }


    }
}

