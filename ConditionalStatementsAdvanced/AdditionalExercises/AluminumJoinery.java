package Basic.ConditionalStatementsAdvanced.AdditionalExercises;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWindows = Integer.parseInt(scanner.nextLine());
        String typeWindow = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price = 0;

        if (countWindows < 10) {
            System.out.println("Invalid order");
            return;
        } else {
            if (typeWindow.equals("90X130")) {
                price = countWindows * 110.0;
                if (countWindows > 30 && countWindows <= 60) {
                    price = price * 0.95;
                } else if (countWindows > 60) {
                    price = price * 0.92;
                }
            } else if (typeWindow.equals("100X150")) {
                price = countWindows * 140.0;
                if (countWindows > 40 && countWindows <= 80) {
                    price = price * 0.94;
                } else if (countWindows > 80) {
                    price = price * 0.90;
                }
            } else if (typeWindow.equals("130X180")) {
                price = countWindows * 190.0;
                if (countWindows > 20 && countWindows <= 50) {
                    price = price * 0.93;
                } else if (countWindows > 50) {
                    price = price * 0.88;
                }
            } else if (typeWindow.equals("200X300")) {
                price = countWindows * 250.0;
                if (countWindows > 25 && countWindows <= 50) {
                    price = price * 0.91;
                } else if (countWindows > 50) {
                    price = price * 0.86;
                }
            }
        }

        if (delivery.equals("With delivery")) {
            price = price + 60;
        }

        if (countWindows > 99) {
            price = price * 0.96;
        }

        System.out.printf("%.2f BGN", price);
    }
}



