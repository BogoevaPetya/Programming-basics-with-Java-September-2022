package Basic.Exams.April2019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMovies = Integer.parseInt(scanner.nextLine());
        double min = Double.MAX_VALUE;
        String minMovie = "";

        double max = Double.MIN_VALUE;
        String maxMovie = "";

        double sumRatings = 0;

        for (int i = 1; i <= countMovies; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRatings += rating;

            if (rating > max) {
                max = rating;
                maxMovie = movieName;
            }
            if (rating < min) {
                min = rating;
                minMovie = movieName;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n", maxMovie, max);
        System.out.printf("%s is with lowest rating: %.1f%n", minMovie, min);
        System.out.printf("Average rating: %.1f%n", sumRatings / countMovies);
    }
}
