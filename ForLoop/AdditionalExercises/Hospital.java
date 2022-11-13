package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= days ; i++) {
            int patientsForTheDay = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && untreatedPatients > treatedPatients) {
                doctors++;
            }

            if (patientsForTheDay > doctors) {
                treatedPatients += doctors;
                untreatedPatients += patientsForTheDay - doctors;
            } else {
                treatedPatients += patientsForTheDay;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
