package Basic.ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int count1 = 0; //бр. числа в първата група;
        int count2 = 0; //бр.числа във втората група;
        int count3 = 0; //бр. числа в третата група;
        int count4 = 0; //бр. числа в четвъртата група;
        int count5 = 0; //бр. числа в петата група;

        for (int number = 1; number <= countNumbers; number++) {
            int value = Integer.parseInt(scanner.nextLine()); //стойността на числата;

            if (value < 200) {
                count1++;
            } else if (value >= 200 && value <= 399) {
                count2++;
            } else if (value >= 400 && value <= 599) {
                count3++;
            } else if (value >= 600 && value <= 799) {
                count4++;
            } else if (value >= 800) {
                count5++;
            }
        }

        double p1 = (count1 * 1.0 /countNumbers ) * 100;
        double p2 = (count2 * 1.0 /countNumbers) * 100;
        double p3 = (count3 * 1.0 /countNumbers) * 100;
        double p4 = (count4 * 1.0 /countNumbers) * 100;
        double p5 = (count5 * 1.0 /countNumbers) * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
