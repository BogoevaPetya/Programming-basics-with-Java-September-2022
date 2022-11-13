package Basic.Exams.July2019;

import java.util.Scanner;

public class E06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        while(!name.equals("Stop")) {

            int currentPoints = 0;
            for (int i = 0; i < name.length() ; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == name.charAt(i)) {
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
            }

            if (currentPoints >= maxPoints) {
                maxPoints = currentPoints;
                winner = name;
            }
            
            name = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
