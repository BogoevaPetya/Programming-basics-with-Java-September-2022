package Basic.Exams.July2019;

import java.util.Scanner;

public class E04Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double areaForPainting = (high * width * 4);
        double areaForPaintingWithoutWindows = Math.ceil(areaForPainting - areaForPainting * 1.0 * percent / 100);

        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            int paint = Integer.parseInt(input);
            areaForPaintingWithoutWindows -= paint;

            if (areaForPaintingWithoutWindows <=0) {
                break;
            }

            input = scanner.nextLine();
        }


        if (areaForPaintingWithoutWindows == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else if (areaForPaintingWithoutWindows < 0) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", areaForPaintingWithoutWindows * -1);
        } else {
            System.out.printf("%.0f quadratic m left.", areaForPaintingWithoutWindows);
        }


    }
}