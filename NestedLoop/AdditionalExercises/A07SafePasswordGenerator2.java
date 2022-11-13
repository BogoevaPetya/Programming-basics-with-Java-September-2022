package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A07SafePasswordGenerator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxCountPass = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        for (int A = 35; A <= 55; A++) {
            for (int B = 64; B <= 96; B++) {
                for (int x = 1; x <= a; x++) {
                    for (int y = 1; y <= b; y++) {
                        if (counter > maxCountPass) {
                            break;
                        }
                        System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);

                        counter++;

                    }

                }

            }
        }
    }
}
