package Basic.WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int year = 1;
        double sumGrades = 0;
        int poorGradesCount = 0;

        while (year <= 12) {
            if (poorGradesCount > 1) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGradesCount++;
                continue;
            }

            sumGrades += grade;
            year++;
        }

        if (poorGradesCount < 1) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, sumGrades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", studentName, year);
        }
    }
}
