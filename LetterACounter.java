import java.util.Scanner;

public class LetterACounter {
    public static void main(String[] args) {
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe uma string: ");
            input = scanner.nextLine();
        }

        int count = countLetterA(input);
        System.out.println("A letra 'a' ocorre " + count + " vezes na string.");
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}