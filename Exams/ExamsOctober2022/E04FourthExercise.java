package Basic.Exams.ExamsOctober2022;

import java.util.Scanner;

public class E04FourthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countComputers = Integer.parseInt(scanner.nextLine());
        double sumSales = 0;
        double sumRating = 0;

        for (int i = 1; i <= countComputers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            int rating = number % 10;
            sumRating = sumRating + rating;
            int possibleSale = number / 10;

            double realSales = 0;
            if (rating == 2) {
                realSales = 0;
            } else if (rating == 3) {
                realSales = possibleSale * 0.50;
            } else if (rating == 4) {
                realSales = possibleSale * 0.70;
            } else if (rating == 5) {
                realSales = possibleSale * 0.85;
            } else if (rating == 6) {
                realSales = possibleSale;
            }
            sumSales += realSales;
        }

        System.out.printf("%.2f%n", sumSales);
        System.out.printf("%.2f", sumRating / countComputers);


    }
}
