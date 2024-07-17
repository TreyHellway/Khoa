import java.util.Scanner;

public class AlphaBetUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your words: ");
        String str = scanner.nextLine();
        String modifiedStr = AlphaBetPlus(str);
        String finalOutput = concatenateAndReplace(modifiedStr);
        System.out.println("Modified Output: " + modifiedStr);
        System.out.println("Final Output: " + finalOutput);
    }

    public static String AlphaBetPlus(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if character is a letter
            if (Character.isLetter(c)) {
                char nextChar = (char) (c + 1);

                // Handle wrap around from 'z' to 'a'
                if (c == 'z') {
                    nextChar = 'a';
                } else if (c == 'Z') {
                    nextChar = 'A';
                }

                // Capitalize vowels in the new string
                if (isVowel(nextChar)) {
                    result.append(Character.toUpperCase(nextChar));
                } else {
                    result.append(nextChar);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c) {
        // Check if character is a vowel (case-insensitive)
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static String concatenateAndReplace(String str) {
        StringBuilder concatenated = new StringBuilder(str);

        // Concatenate with "kxbvac1f5h6"
        concatenated.append("kxbvac1f5h6");

        // Replace every third letter with 'X'
        for (int i = 2; i < concatenated.length(); i += 3) {
            concatenated.setCharAt(i, 'X');
        }

        return concatenated.toString();
    }
}
