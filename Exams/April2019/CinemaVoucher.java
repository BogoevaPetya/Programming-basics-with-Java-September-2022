package Basic.Exams.April2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherPrice = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double priceTickets = 0;
        int countTickets = 0;
        int countOther = 0;

        while (!input.equals("End")) {
            int length = input.length();

            if (length > 8) {
                char firstLetter = input.charAt(0);
                char secondLetter = input.charAt(1);
                priceTickets = firstLetter + secondLetter;
                if (voucherPrice >= priceTickets) {
                    voucherPrice -= priceTickets;
                    countTickets++;
                } else {
                    break;
                }

            } else {
                char firstletterOther = input.charAt(0);
                if (voucherPrice >= firstletterOther) {
                    voucherPrice -= firstletterOther;
                    countOther++;
                } else {
                    break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(countTickets);
        System.out.println(countOther);
    }
}
