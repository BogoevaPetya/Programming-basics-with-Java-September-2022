package Basic.ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double apartment = 0;
        double studio = 0;

        switch (month) {
            case ("May"):
            case ("October"):
                studio = nights * 50;
                apartment = nights * 65;
                if (nights > 14) {
                    studio = studio - (studio * 0.30);
                    apartment = apartment - (apartment * 0.10);
                } else if (nights > 7) {
                    studio = studio - (studio * 0.05);
                }
                break;
            case ("June"):
            case ("September"):
                studio = nights * 75.20;
                apartment = nights * 68.70;
                if (nights > 14) {
                    studio = studio - (studio * 0.20);
                    apartment = apartment - (apartment * 0.10);
                }
                break;
            case ("July"):
            case ("August"):
                studio = nights * 76;
                apartment = nights * 77;
                if (nights > 14) {
                    apartment = apartment - (apartment * 0.10);
                }
                break;

        }

        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);

    }
}
