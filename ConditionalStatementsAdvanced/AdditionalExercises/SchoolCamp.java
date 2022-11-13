package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        String typeSport = "";

        switch (season) {
            case "Winter":
                if (typeOfGroup.equals("boys")) {
                    totalPrice = countStudents * 9.60 * countNights;
                    typeSport = "Judo";
                } else if (typeOfGroup.equals("girls")) {
                    totalPrice = countStudents * 9.60 * countNights;
                    typeSport = "Gymnastics";
                } else {
                    totalPrice = countStudents * 10 * countNights;
                    typeSport = "Ski";
            }
                break;
            case "Spring":
                if (typeOfGroup.equals("boys")) {
                totalPrice = countStudents * 7.20 * countNights;
                typeSport = "Tennis";
                } else if(typeOfGroup.equals("girls")) {
                    totalPrice = countStudents * 7.20 * countNights;
                    typeSport = "Athletics";
                } else {
                    totalPrice = countStudents * 9.50 * countNights;
                    typeSport = "Cycling";
                }
                break;
            case "Summer":
                if (typeOfGroup.equals("boys")) {
                    totalPrice = countStudents * 15 * countNights;
                    typeSport = "Football";
                } else if (typeOfGroup.equals("girls")) {
                    totalPrice = countStudents * 15 * countNights;
                    typeSport = "Volleyball";
                } else {
                    totalPrice = countStudents * 20 * countNights;
                    typeSport = "Swimming";
                }
                break;

        }

        if (countStudents >= 50) {
            totalPrice = totalPrice - (totalPrice * 0.50);
        } else if (countStudents >= 20 && countStudents < 50) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (countStudents >= 10 && countStudents < 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        System.out.printf("%s %.2f lv.", typeSport, totalPrice);


    }
}
