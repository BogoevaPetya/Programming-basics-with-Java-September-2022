package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A08SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stotici = Integer.parseInt(scanner.nextLine());
        int desetici = Integer.parseInt(scanner.nextLine());
        int edenici = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= stotici; i++) {
            for (int j = 2; j <= desetici; j++) {
                for (int k = 1; k <= edenici; k++) {
                    if (i % 2 == 0 && k % 2 ==0 && j != 4 && j != 6) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
