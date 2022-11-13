package Basic.Exams.July2019;

import java.util.Scanner;

public class E01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        double entranceTax = Double.parseDouble(scanner.nextLine());
        double priceSunbed = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double entranceAll = entranceTax * countPeople;
        double countSunbeds = Math.ceil(countPeople * 0.75);
        double countUmbrellas = Math.ceil(countPeople * 1.0 / 2);

        double sumAll = entranceAll + countSunbeds * priceSunbed + countUmbrellas * priceUmbrella;

        System.out.printf("%.2f lv.", sumAll);
    }
}
