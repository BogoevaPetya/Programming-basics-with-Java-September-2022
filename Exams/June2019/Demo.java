package Basic.Exams.June2019;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int result = num % 10;
        int result2 = num % 100;
        System.out.println(result);
        System.out.println(result2);
    }
}
