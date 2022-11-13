package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A14PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int sum = 97 + l;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < sum; k++) {
                    for (int m = 97; m < sum; m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
