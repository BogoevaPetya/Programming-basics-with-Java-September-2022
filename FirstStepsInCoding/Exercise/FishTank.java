package Basic.FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int heigh = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = lenght * width * heigh;
        double volumeLiters = volumeCm * 0.001;
        double needLiters = volumeLiters * (1 - percent / 100.0);

        System.out.println(needLiters);




    }
}
