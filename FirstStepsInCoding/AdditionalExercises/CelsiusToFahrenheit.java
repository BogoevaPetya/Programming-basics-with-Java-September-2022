package Basic.FirstStepsInCoding.AdditionalExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double fahreinheit = celsius * (9 / 5.0) + 32;

        System.out.printf("%.2f", fahreinheit);
    }
}
