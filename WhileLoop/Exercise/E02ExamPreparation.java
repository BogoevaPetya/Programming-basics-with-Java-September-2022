package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scanner.nextLine());

        int failedTimes = 0;
        double sumGrades = 0;
        int solvedProblemsCount = 0;
        String lastProblem = ""; //за да се запази последната решена задача


        while (failedTimes < failedThreshold) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                break;
            }
            lastProblem = problemName;
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                failedTimes++;
            }

            sumGrades += grade;
            solvedProblemsCount++;
        }


        if (failedTimes >= failedThreshold) {
            System.out.printf("You need a break, %d poor grades.%n", failedTimes);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / solvedProblemsCount);
            System.out.printf("Number of problems: %d%n", solvedProblemsCount);
            System.out.printf("Last problem: %s%n", lastProblem);
        }
    }
}
