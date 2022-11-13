package Basic.Exams.ExamsOctober2022;

import java.util.Scanner;

public class E06SixthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {

                        int sum = a + b + c + d;
                        int product = a * b * c * d;
                        int div = product / sum;

                        if (sum == product && n % 10 == 5) {
                            counter++;
                            System.out.printf("%d%d%d%d", a, b, c, d);
                        } else if (div == 3 && n % 3 == 0 ) {
                            counter++;
                            System.out.printf("%d%d%d%d", d, c, b, a);
                        } else {
                            System.out.println("Nothing found");
                        }

                        if (counter == 1) {
                            break;
                        }

                    }
                }
            }

        }

    }
}
