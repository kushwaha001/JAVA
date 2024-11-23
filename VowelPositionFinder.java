import java.util.Scanner;

public class VowelPositionFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
        findVowels(input);
        scanner.close();
    }

    private static void findVowels(String input) {
        String vowels = "aeiouAEIOU";

        System.out.println("Vowels and their positions:");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                System.out.println("Vowel: " + c + ", Position: " + (i + 1));
            }
        }
    }
}
