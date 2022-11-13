package Basic.NestedLoop.Exercise;

import java.util.Scanner;

public class E06CinemaTickets2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int allTickets = 0;
        int standardCount = 0;
        int studentCount = 0;
        int kidCount = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int ticketsForThisMovie = 0; // нулираме билетите от предходния филм

            String command = scanner.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;

                allTickets++;
                ticketsForThisMovie++;

                switch (typeTicket) {
                    case "standard":
                        standardCount++;
                        break;
                    case "student":
                        studentCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }

                if (ticketsForThisMovie == freeSeats) {
                    break;
                }

                command = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, ticketsForThisMovie * 1.0 / freeSeats * 100);

            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.", standardCount * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCount * 1.0 / allTickets * 100);
    }
}
