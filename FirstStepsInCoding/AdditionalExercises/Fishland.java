package Basic.FirstStepsInCoding.AdditionalExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumriaKg = Double.parseDouble(scanner.nextLine());
        double priceCacaKg = Double.parseDouble(scanner.nextLine());

        double countPalamud = Double.parseDouble(scanner.nextLine());
        double countSafrid = Double.parseDouble(scanner.nextLine());
        int countMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud = priceSkumriaKg + priceSkumriaKg * 0.60;
        double priceSafrid = priceCacaKg + priceCacaKg * 0.80;
        double priceMidi = countMidi * 7.50;

        double priceAll = countPalamud * pricePalamud + countSafrid * priceSafrid + priceMidi;

        System.out.printf("%.2f", priceAll);
    }
}
