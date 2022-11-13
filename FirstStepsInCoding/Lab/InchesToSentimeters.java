package Basic.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToSentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double inches = Double.parseDouble(scanner.nextLine());

        double centemeters = inches *2.54;

        System.out.println(centemeters);
    }
}
