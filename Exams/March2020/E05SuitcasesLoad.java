package Basic.Exams.March2020;

import java.util.Scanner;

public class E05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        int suitcasesCount = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double suitcaseVolume = Double.parseDouble(input);

            if (capacity <= suitcaseVolume) {
                break;
            } else {
                suitcasesCount++;
            }

            if (suitcasesCount == 3) {
                suitcaseVolume = suitcaseVolume + suitcaseVolume * 0.10;
                capacity -= suitcaseVolume;
            } else {
                capacity -= suitcaseVolume;
            }

            input = scanner.nextLine();

        }

        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", suitcasesCount);
    }
}
