package Basic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBookList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int totalHours = countPages / pagesPerHour;
        int hoursPerDay = totalHours / countDays;
        System.out.println(hoursPerDay);
    }
}
