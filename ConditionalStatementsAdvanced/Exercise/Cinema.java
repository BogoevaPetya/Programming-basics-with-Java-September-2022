package Basic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int collons = Integer.parseInt(scanner.nextLine());

        double income = 0;

        switch (projection) {
            case "Premiere":
                income = rows * collons * 12.0;
                break;
            case "Normal":
                income = rows * collons * 7.50;
                break;
            case "Discount":
                income = rows * collons * 5.0;
                break;
        }

        System.out.printf("%.2f leva", income);
    }
}
