package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationCost = Double.parseDouble(scanner.nextLine());
        double availableCash = Double.parseDouble(scanner.nextLine());

        int allDays = 0;
        int spendDays = 0;

        while (availableCash < vacationCost && spendDays < 5) {
            String action = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());

            allDays++;

            if (action.equals("spend")) {
                availableCash = availableCash - cash;
                spendDays++;
                if (availableCash < 0) {
                    availableCash = 0;
                }
            } else if (action.equals("save")) {
                availableCash = availableCash + cash;
                spendDays = 0; //ако не сложим това условие може в if-a да е имало 4 пъти харчене, после спестява
                //и после като пак харчи ще станат 5 пъти харчене, но реално те не са последователни, затова трябва
                //да се нулират, когато спестява
            }

        }

        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDays);
        }

        if (availableCash >= vacationCost) {
            System.out.printf("You saved the money for %d days.", allDays);
        }
    }
}
