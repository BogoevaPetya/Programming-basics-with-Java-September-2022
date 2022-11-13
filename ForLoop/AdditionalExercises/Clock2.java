package Basic.ForLoop.AdditionalExercises;

import java.util.Scanner;

public class Clock2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = 0;
        int m = 0;
        int s = 0;

        for (h = 0; h <= 23; h++) {
            for (m = 0; m <= 59; m++) {
                for (s = 0; s <= 59; s++) {
                    System.out.printf("%d : %d : %d%n", h, m, s);
                }
            }
        }
    }
}
