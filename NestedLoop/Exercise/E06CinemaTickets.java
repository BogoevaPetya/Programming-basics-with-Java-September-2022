package Basic.NestedLoop.Exercise;

import java.util.Scanner;

public class E06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int allCountTickets = 0;
        int studentTicketsCount = 0;
        int kidTicketsCount = 0;
        int standardTicketsCount = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int countTicket = 0;

            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;
                allCountTickets++;
                countTicket++;

                switch (typeTicket) {
                    case "student":
                        studentTicketsCount++;
                        break;
                    case "kid":
                        kidTicketsCount++;
                        break;
                    case "standard":
                        standardTicketsCount++;
                        break;
                }

                if (countTicket == freeSeats) {
                    break;
                }

                command = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, countTicket * 1.0 / freeSeats * 100);

            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", allCountTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTicketsCount * 1.0 / allCountTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketsCount * 1.0 / allCountTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidTicketsCount * 1.0 / allCountTickets * 100);
    }
}
