package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int countAllFans = Integer.parseInt(scanner.nextLine());

        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 1; i <= countAllFans ; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "V":
                    countV++;
                    break;
                case "G":
                    countG++;
                    break;
            }
        }

        System.out.printf("%.2f%%%n", (countA * 1.0 / countAllFans) * 100);
        System.out.printf("%.2f%%%n", (countB * 1.0 / countAllFans) * 100);
        System.out.printf("%.2f%%%n", (countV * 1.0 / countAllFans) * 100);
        System.out.printf("%.2f%%%n", (countG * 1.0 / countAllFans) * 100);
        System.out.printf("%.2f%%%n", (countAllFans * 1.0 / stadiumCapacity) * 100);
    }
}
