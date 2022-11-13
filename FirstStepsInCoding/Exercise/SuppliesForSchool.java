package Basic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumPens = countPens * 5.80;
        double sumMarkers = countMarkers * 7.20;
        double sumLiters = liters * 1.20;
        double totalSum = sumPens + sumMarkers + sumLiters;
        double finalSum = totalSum - (percent / 100.0) * totalSum;

        System.out.println(finalSum);



    }
}
