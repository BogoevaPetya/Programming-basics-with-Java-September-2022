package Basic.Exams.ExamsOctober2022;

import java.util.Scanner;

public class E01FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paper = Integer.parseInt(scanner.nextLine());
        int textile = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePaper = paper * 5.80;
        double priceTextile = textile * 7.20;
        double priceGlue = glue * 1.20;
        double priceAll = pricePaper + priceTextile + priceGlue;
        double priceAfterDiscount = priceAll - (priceAll * percent / 100);

        System.out.printf("%.3f", priceAfterDiscount);
    }
}
