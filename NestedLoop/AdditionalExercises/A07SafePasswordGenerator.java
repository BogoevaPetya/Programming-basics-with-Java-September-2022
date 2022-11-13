package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A07SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxCountPass = Integer.parseInt(scanner.nextLine());

        char Aa = 35;
        char Bb = 64;
        int counter = 1;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                if (counter > maxCountPass) {
                    break;
                }
                System.out.printf("%c%c%d%d%c%c|", Aa, Bb, x, y, Bb, Aa);

                Aa++;
                Bb++;
                counter++;

                if (Aa > 55) {
                    Aa = 35;
                }
                if (Bb > 96) {
                    Bb = 64;
                }
            }
        }

    }
}

