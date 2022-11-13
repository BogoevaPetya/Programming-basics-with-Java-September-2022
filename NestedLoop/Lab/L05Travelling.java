package Basic.NestedLoop.Lab;

import java.util.Scanner;

public class L05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();


        while (!inputLine.equals("End")) {
            String destination = inputLine;
            double priceTrip = Double.parseDouble(scanner.nextLine());

            double sum = 0;
            while (sum < priceTrip) {
                double amount = Double.parseDouble(scanner.nextLine());
                sum += amount;
            }
            System.out.printf("Going to %s!%n", destination);

            inputLine = scanner.nextLine();


        }
    }
}
