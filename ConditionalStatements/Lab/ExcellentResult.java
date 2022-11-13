package Basic.ConditionalStatements.Lab;

import java.util.Scanner;

public class ExcellentResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}
