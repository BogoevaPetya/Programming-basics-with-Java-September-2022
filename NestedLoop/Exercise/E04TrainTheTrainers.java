package Basic.NestedLoop.Exercise;

import java.util.Scanner;

public class E04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int allGradesCount = 0;
        double sumAllGrades = 0;


        while (!command.equals("Finish")) {
            String presentationName = command;

            double sumGrade = 0; // извеждаме променливата преди for цикъла, защото ако я представим вътре в него, после не мога да я ползвам на 27ми ред
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                allGradesCount++; // натрупва си се, защото е изнесено като променлива още в началото
                sumGrade += grade;
            }
            sumAllGrades += sumGrade; //това нещо ако го запишем в тялото на for цикъла ще е равно на sumGrade, защото ще брои оценките само за цикъла, а няма да натрупва
            double avgGrade = sumGrade / n;
            System.out.printf("%s - %.2f.%n", presentationName, avgGrade);

            command = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", sumAllGrades / allGradesCount);
    }
}
