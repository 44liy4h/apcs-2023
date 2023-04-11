import java.util.Scanner;

public class SpellingBeeGame {

    private static final String ALLOWED_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int REQUIRED_LETTER_COUNT = 7;
    private static final int MIN_WORD_LENGTH = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S
        System.out.println("Enter the seven uppercase letters");
        String inputLetters = scanner.nextLine();
        char[] letters = inputLetters.replace(" ", "").toCharArray();
        System.out.println("Enter words that can be formed using the given letters (minimum " + MIN_WORD_LENGTH + " letters):");
        findValidWords("", letters, new boolean[letters.length]);
    }

    private static void findValidWords(String currentWord, char[] letters, boolean[] used) {
        if (currentWord.length() >= MIN_WORD_LENGTH && isValidWord(currentWord, letters)) {
            System.out.println("Valid word: " + currentWord);
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                findValidWords(currentWord + letters[i], letters, used);
                used[i] = false;
            }
        }
    }

    private static boolean isValidWord(String word, char[] letters) {
        if (word.length() < MIN_WORD_LENGTH) {
            return false;
        }
        boolean containsRequiredLetter = false;
        for (char c : word.toCharArray()) {
            if (ALLOWED_LETTERS.indexOf(c) == -1) {
                return false;
            }
            if (word.indexOf(c) == word.lastIndexOf(c) && new String(letters).contains(String.valueOf(c))) {
                containsRequiredLetter = true;
            }
        }
        return containsRequiredLetter;
    }
}
