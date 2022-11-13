package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        double sumGrades = 0;

        for (int i = 1; i <= countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 2.99) {
                count2++;
                sumGrades = sumGrades + grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                count3++;
                sumGrades = sumGrades + grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                count4++;
                sumGrades = sumGrades + grade;
            } else if (grade >= 5.00) {
                count5++;
                sumGrades = sumGrades + grade;
            }
        }

        System.out.printf("Top students: %.2f%%%n", (count5 * 1.0 / countStudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (count4 * 1.0 / countStudents) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (count3 * 1.0 / countStudents) * 100);
        System.out.printf("Fail: %.2f%%%n", (count2 * 1.0 / countStudents) * 100);
        System.out.printf("Average: %.2f", sumGrades / countStudents);

    }
}
