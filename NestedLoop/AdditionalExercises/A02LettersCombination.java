package Basic.NestedLoop.AdditionalExercises;

import java.util.Scanner;

public class A02LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char from = scanner.next().charAt(0);
        char to = scanner.next().charAt(0);
        char notAllowed = scanner.next().charAt(0);

        int counter = 0;

        for (char i = from; i <= to; i++) {
            if (i == notAllowed) {   //не слагам скоби на if-проверката
                continue;
            }
            for (char j = from; j <= to; j++) {
                if (j == notAllowed) {
                    continue;
                }
                for (char k = from; k <= to; k++) {
                    if (k == notAllowed) {
                        continue;
                    }
                    counter++;
                    System.out.printf("%c%c%c ", i, j, k);
                }
            }
        }
        System.out.print(counter);
    }
}




