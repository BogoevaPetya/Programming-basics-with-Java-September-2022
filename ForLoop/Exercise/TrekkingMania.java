package Basic.ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kalimandzharo = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numberOfGroups; i++) {
            int countPeopleInGroup = Integer.parseInt(scanner.nextLine());

        if (countPeopleInGroup <= 5) {
            musala += countPeopleInGroup;
        } else if (countPeopleInGroup >= 6 && countPeopleInGroup <= 12) {
            monblan += countPeopleInGroup;
        } else if (countPeopleInGroup >= 13 && countPeopleInGroup <= 25) {
            kalimandzharo += countPeopleInGroup;
        } else if (countPeopleInGroup >= 26 && countPeopleInGroup <= 40) {
            k2 += countPeopleInGroup;
        } else if (countPeopleInGroup >= 40) {
            everest += countPeopleInGroup;
        }

        }

        int totalPeople = musala + monblan + kalimandzharo + k2 + everest;
        System.out.printf("%.2f%%%n", (musala * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (monblan * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (kalimandzharo * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (k2 * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%%n", (everest * 1.0 / totalPeople) * 100);


    }
}
