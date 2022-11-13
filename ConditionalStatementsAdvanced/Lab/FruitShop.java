package Basic.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String daysOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isWorkingDays = daysOfWeek.equals("Monday") ||
                daysOfWeek.equals("Tuesday") ||
                daysOfWeek.equals("Wednesday") ||
                daysOfWeek.equals("Thursday") ||
                daysOfWeek.equals("Friday");
        boolean isWeekend = daysOfWeek.equals("Saturday") || daysOfWeek.equals("Sunday");

        boolean isValidData = true;

        double price = 0;

        if (isWorkingDays) {
            if (product.equals("banana"))
                price = 2.50;
            else if (product.equals("apple"))
                price = 1.20;
            else if (product.equals("orange"))
                price = 0.85;
            else if (product.equals("grapefruit"))
                price = 1.45;
            else if (product.equals("kiwi"))
                price = 2.70;
            else if (product.equals("pineapple"))
                price = 5.50;
            else if (product.equals("grapes"))
                price = 3.85;
            else {
                isValidData = false;
            }
        }else if (isWeekend) {
            if (product.equals("banana"))
                price = 2.70;
            else if (product.equals("apple"))
                price = 1.25;
            else if (product.equals("orange"))
                price = 0.90;
            else if (product.equals("grapefruit"))
                price = 1.60;
            else if (product.equals("kiwi"))
                price = 3.00;
            else if (product.equals("pineapple"))
                price = 5.60;
            else if (product.equals("grapes"))
                price = 4.20;
            else {
                isValidData = false;
            }
        } else {
            isValidData = false;
        }


        if (!isValidData) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", quantity * price);
        }

    } }