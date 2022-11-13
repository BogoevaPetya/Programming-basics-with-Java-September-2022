package Basic.WhileLoop.Exercise;

import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();
        String currentBook = scanner.nextLine();

        int checkedBooksCounter = 0;

        while (!currentBook.equals(favoriteBook)) {
            if (currentBook.equals("No More Books")) {
                break;
            }
            checkedBooksCounter++;
            currentBook = scanner.nextLine();
        }

        if (currentBook.equals(favoriteBook)) {
            System.out.printf("You checked %d books and found it.", checkedBooksCounter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checkedBooksCounter);
        }
    }
}
