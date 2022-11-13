package Basic.Exams.July2020;

import java.util.Scanner;

public class E06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startOfScope = Integer.parseInt(scanner.nextLine());
        int endOfScope = Integer.parseInt(scanner.nextLine());

        int startThousands = startOfScope / 1000 % 10;
        int startHundreds = startOfScope / 100 % 10;
        int startTens = startOfScope / 10 % 10;
        int startOnes = startOfScope % 10;

        int endThousands = endOfScope / 1000 % 10;
        int endHundreds = endOfScope / 100 % 10;
        int endTens = endOfScope / 10 % 10;
        int endOnes = endOfScope % 10;

        for (int i = startThousands; i <= endThousands; i++) {
            for (int j = startHundreds; j <= endHundreds; j++) {
                for (int k = startTens; k <= endTens; k++) {
                    for (int l = startOnes; l <= endOnes; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }

        }
    }
}


