package Basic.ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int textLengh = text.length();

        for (int i = 0; i < textLengh; i++) {
            char letter = text.charAt(i);
            System.out.println(letter);
        }


    }
}
